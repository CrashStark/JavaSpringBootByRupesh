package com.example.Doctor.DoctorModuleMS.Entity;

public class Patients {
        private String patientName;
        private Long contactDetails;

        public Patients() {
        }

        public Patients(String patientName, Long contactDetails) {
                this.patientName = patientName;
                this.contactDetails = contactDetails;
        }

        public String getPatientName() {
                return patientName;
        }

        public void setPatientName(String patientName) {
                this.patientName = patientName;
        }

        public Long getContactDetails() {
                return contactDetails;
        }

        public void setContactDetails(Long contactDetails) {
                this.contactDetails = contactDetails;
        }
}
