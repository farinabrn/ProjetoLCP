CREATE TABLE `projeto`.`despesa` (
  `idDespesa` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `descricao` VARCHAR(100) NULL COMMENT '',
  `preco` DOUBLE NULL COMMENT '',
  `idUsuario` INT(11) NULL COMMENT '',
  PRIMARY KEY (`idDespesa`)  COMMENT '',
  INDEX `fk_idUsuario_idx` (`idUsuario` ASC)  COMMENT '',
  CONSTRAINT `fk_idUsuario`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `projeto`.`usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;
ALTER TABLE `projeto`.`despesa` 
CHANGE COLUMN `idUsuario` `idUsuario` INT(11) NULL DEFAULT NULL COMMENT '' AFTER `idDespesa`;
