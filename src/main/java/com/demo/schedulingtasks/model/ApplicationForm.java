package com.demo.schedulingtasks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Application_Form")
public class ApplicationForm {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "Id")
		private Integer Id;
		
		@Column(name = "Age")
		private Integer Age;
		
		@Column(name = "Tabacco")
		private boolean Tobacco;
		
		@Column(name = "Insurance")
		private boolean Insurance;
		
		@Column(name = "Status")
		private boolean Status;
		
		public ApplicationForm() {}
		
		public ApplicationForm(Integer id, Integer age, boolean tobacco, boolean insurance, boolean status) {
			super();
			Id = id;
			Age = age;
			Tobacco = tobacco;
			Insurance = insurance;
			Status = status;
		}

		public Integer getId() {
			return Id;
		}

		public void setId(Integer id) {
			Id = id;
		}

		public Integer getAge() {
			return Age;
		}

		public void setAge(Integer age) {
			Age = age;
		}

		public boolean isTobacco() {
			return Tobacco;
		}

		public void setTobacco(boolean tobacco) {
			Tobacco = tobacco;
		}

		public boolean isInsurance() {
			return Insurance;
		}

		public void setInsurance(boolean insurance) {
			Insurance = insurance;
		}
		
		public boolean isStatus() {
			return Status;
		}
		
		public void setStatus(boolean status) {
			Status = status;
		}
}
