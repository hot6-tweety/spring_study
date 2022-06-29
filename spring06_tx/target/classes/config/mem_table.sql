SELECT constraint_name
FROM user_constraints
WHERE table_name='MEM';

ALTER TABLE mem
ADD CONSTRAINT mem_num_pk  PRIMARY KEY(num);