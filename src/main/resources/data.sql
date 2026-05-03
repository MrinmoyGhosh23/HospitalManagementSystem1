INSERT INTO patient_tbl(patient_name,gender,brithdate,email,blood_group)
values
('Mrinmoy Ghosh','Male','23/05/2005','ghosh.mrinmoy000@gmail1.com','B_POSITIVE'),
('Akash Ghosh','Male','15/04/2000','iamakashghosh581@gmail.com','AB_NEGATIVE'),
('Jasprit Arora','Male','18/09/1998','jaspritarora29@gmail.com','B_NEGATIVE'),
('Smitriti Roy','Female','05/01/2003','smritiroy000@gmail.com','O_POSITIVE'),
('Adrija Pathani','Female','06/02/2004','adrijapathani@gmail.com','AB_POSITIVE');



INSERT INTO doctor(name,Specialist,email)
values
('Dr.Ramesh Mehta','Kidney','mail@abb'),
('Dr.kumar Barma','blood','kumar Barma@abb'),
('Dr.Amlrendra Bahubali','Brain','Amlrendra Bahubali@abb');

INSERT INTO appointment (appointment_time, reason, doctor_id, patient_id)
VALUES
  ('2025-07-01 10:30:00', 'General Checkup', 1, 2),
  ('2025-07-02 11:00:00', 'Skin Rash', 2, 2),
  ('2025-07-03 09:45:00', 'Knee Pain', 3, 3),
  ('2025-07-04 14:00:00', 'Follow-up Visit', 1, 1),
  ('2025-07-05 16:15:00', 'Consultation', 1, 4),
  ('2025-07-06 08:30:00', 'Allergy Treatment', 2, 5);