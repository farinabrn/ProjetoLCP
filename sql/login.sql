ALTER TABLE `projeto`.`usuario` 
ADD COLUMN `userName` VARCHAR(45) NOT NULL COMMENT '' AFTER `idContaBancaria`,
ADD COLUMN `senha` VARCHAR(45) NULL COMMENT '' AFTER `userName`;
