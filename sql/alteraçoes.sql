ALTER TABLE `projeto`.`conta` 
ADD INDEX `fk_idUsuarioPagador_idx` (`idUsuarioPagador` ASC)  COMMENT '';
ALTER TABLE `projeto`.`conta` 
ADD CONSTRAINT `fk_idUsuarioPagador_idx`
  FOREIGN KEY (`idUsuarioPagador`)
  REFERENCES `projeto`.`usuario` (`idUsuario`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
