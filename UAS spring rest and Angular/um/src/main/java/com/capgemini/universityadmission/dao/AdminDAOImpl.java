package com.capgemini.universityadmission.dao;

import java.util.LinkedHashSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.security.auth.login.LoginException;

import org.springframework.stereotype.Repository;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.Participant;
import com.capgemini.universityadmission.bean.ProgramsOffered;
import com.capgemini.universityadmission.bean.ProgramsScheduled;
import com.capgemini.universityadmission.bean.Users;

@Repository
public class AdminDAOImpl implements AdminDAO {
	@PersistenceUnit
	private EntityManagerFactory emf;
	Users admin = new Users();

	@Override
	public Users adminLogin(Integer adminid, String password) {

		EntityManager entityManager = emf.createEntityManager();
		try {

			String jpql = "from Users where loginId=:login_id and password=:password";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("login_id", adminid);
			query.setParameter("password", password);
			Users lst = (Users) query.getSingleResult();
			if (lst == null) {
				throw new LoginException();
			} else {

				return lst;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return null;
	}

	@Override
	public boolean addProgramsOffered(ProgramsOffered program) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		boolean isAdded = false;
		try {
			tx.begin();
			manager.persist(program);
			tx.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();

		return isAdded;

	}

	@Override
	public boolean updateProgramsOffered(ProgramsOffered program) {
		EntityManager entityManager = emf.createEntityManager();
		ProgramsOffered infobean = entityManager.find(ProgramsOffered.class, program.getProgramName());
		boolean isUpdate = false;

		if (infobean != null) {
			String programName = program.getProgramName();
			if (programName != null) {
				infobean.setProgramName(programName);
			}

			int duration = program.getDuration();
			if (duration > 0) {
				infobean.setDuration(duration);
			}
			String applicantEligibility = program.getApplicantEligibility();
			if (applicantEligibility != null) {
				infobean.setApplicantEligibility(applicantEligibility);
				;
			}
			String description = program.getDescription();
			if (description != null) {
				infobean.setDescription(description);
			}
			String degreeCertificateOffered = program.getDegreeCertificateOffered();
			if (degreeCertificateOffered != null) {
				infobean.setDegreeCertificateOffered(degreeCertificateOffered);
			}

			try {
				EntityTransaction transaction = entityManager.getTransaction();
				transaction.begin();
				entityManager.persist(infobean);
				transaction.commit();
				isUpdate = true;

			} catch (Exception e) {
				e.printStackTrace();
			}
			entityManager.close();
		}
		return isUpdate;
	}

	@Override
	public boolean deleteProgramsOffered(String programName) {
		EntityManager entityManager = emf.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			ProgramsOffered programsOffered = entityManager.find(ProgramsOffered.class, programName);
			entityManager.remove(programsOffered);
			tx.commit();
			isDeleted = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		entityManager.close();
		return isDeleted;
	}

	@Override
	public boolean addProgramsScheduled(ProgramsScheduled program) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		boolean isAdded = false;
		try {
			tx.begin();
			manager.persist(program);
			tx.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();

		return false;

	}// End of addprogramsscheduled()

	@Override
	public boolean deleteProgramsScheduled(int scheduledProgramId) {
		EntityManager entityManager = emf.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			ProgramsScheduled programsScheduled = entityManager.find(ProgramsScheduled.class, scheduledProgramId);
			entityManager.remove(programsScheduled);
			tx.commit();
			isDeleted = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		entityManager.close();
		return isDeleted;
	}

	@Override
	public boolean updateProgramsScheduled(ProgramsScheduled program) {
		EntityManager entityManager = emf.createEntityManager();
		ProgramsScheduled infobean = entityManager.find(ProgramsScheduled.class, program.getScheduledProgramId());
		boolean isUpdate = false;

		if (infobean != null) {
			int scheduledProgram = program.getScheduledProgramId();
			if (scheduledProgram > 0) {
				infobean.setScheduledProgramId(scheduledProgram);
			}
			String programName = program.getProgramName();
			if (programName != null) {
				infobean.setProgramName(programName);
			}

			String location = program.getLocation();
			if (location != null) {
				infobean.setLocation(location);
			}

			int SessionsPerWeek = program.getSessionPerWeek();
			if (SessionsPerWeek > 0) {
				infobean.setSessionPerWeek(SessionsPerWeek);
			}
			try {
				EntityTransaction transaction = entityManager.getTransaction();
				transaction.begin();
				entityManager.persist(infobean);
				transaction.commit();
				isUpdate = true;

			} catch (Exception e) {
				e.printStackTrace();
			}
			entityManager.close();
		}
		return isUpdate;
	}

	/*
	 * @Override public List<Participant> viewAllAcceptedApplications() {
	 * EntityManager em = emf.createEntityManager(); String jpql
	 * ="select * from participant where status= 'accept'"; Query query=
	 * em.createQuery(jpql); query.setParameter("", value) return null; }
	 */



	@Override
	public List<Application> viewAllRejectedApplications() {
			List<Application> rejected=null;
			EntityManager em = emf.createEntityManager();
			Query query = em.createQuery("from Application where status =:status",Application.class);
			query.setParameter("status", "reject");
			rejected = query.getResultList();
			return rejected;
	}

	@Override
	public List<Application> viewAllAcceptedApplications() {
		List<Application> accepted=null;
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("from Application where status =:status",Application.class);
		query.setParameter("status", "accept");
		accepted = query.getResultList();
		return accepted;
	}
	
	@Override
	public List<Application> viewAllConfirmedApplications() {
		List<Application> confirmed=null;
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("from Application where status =:status",Application.class);
		query.setParameter("status", "confirm");
		confirmed = query.getResultList();
		return confirmed;
	}
	

	

}
