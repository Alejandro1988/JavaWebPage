-- Una cerveza puede tener una o multiples maltas, lupulos, levaduras y clarificantes
-- una cerveza tiene sus caracteristicas determinadas segun sus componentes
-- Cada elaboracion de una cerveza tiene resultados diferentes, pero siempreo los mismos compuestos (maltas, lupulos, levaduras y clarificantes)

CREATE TABLE malta (
  id INT NOT NULL,
  nombre VARCHAR (25) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE lupulo (
  id INT NOT NULL,
  nombre VARCHAR (25) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE levadura (
  id INT NOT NULL,
  nombre VARCHAR (25) NOT NULL,
  nombreComercial VARCHAR (5) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE clarificante (
  id INT NOT NULL,
  nombre VARCHAR (25) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE cerveza (
  id INT NOT NULL,
  nombre VARCHAR (25) NOT NULL,
  densidInicial SMALLINT NOT NULL,
  densidFinal SMALLINT NOT NULL,
  IBUS DECIMAL (4 , 2),
  alcohol DECIMAL (4, 2),
  aguaMacerado DECIMAL (5, 2),
  aguaMaceradoTemp SMALLINT,
  aguaLavado DECIMAL (5, 2),
  aguaLavadoTemp SMALLINT,
  maceracionTiempo TIME,
  maceracionTemp SMALLINT,
  hervido TIME,
  PRIMARY KEY (id)
);

CREATE TABLE cerveza_clarificante (
  idCerveza INT NOT NULL,
  idClarificante INT NOT NULL,
  cantidad INT NOT NULL,
  PRIMARY KEY (idCerveza, idClarificante),
  FOREIGN KEY (idCerveza) REFERENCES cerveza(id),
  FOREIGN KEY (idClarificante) REFERENCES clarificante(id)
);

CREATE TABLE cerveza_lupulo (
  idCerveza INT NOT NULL,
  idLupulo INT NOT NULL,
  cantidad INT NOT NULL,
  PRIMARY KEY (idCerveza, idLupulo),
  FOREIGN KEY (idCerveza) REFERENCES cerveza(id),
  FOREIGN KEY (idLupulo) REFERENCES lupulo(id)
);

CREATE TABLE cerveza_malta (
  idCerveza INT NOT NULL,
  idMalta INT NOT NULL,
  cantidad DECIMAL(4, 2) NOT NULL,
  PRIMARY KEY (idCerveza, idMalta),
  FOREIGN KEY (idCerveza) REFERENCES cerveza(id),
  FOREIGN KEY (idMalta) REFERENCES malta(id)
);

CREATE TABLE cerveza_levadura (
  idCerveza INT NOT NULL,
  idLevadura INT NOT NULL,
  cantidad INT NOT NULL,
  PRIMARY KEY (idCerveza, idLevadura),
  FOREIGN KEY (idCerveza) REFERENCES cerveza(id),
  FOREIGN KEY (idLevadura) REFERENCES levadura(id)
);

CREATE TABLE elaboracion (
  id INT NOT NULL,
  idCerveza INT NOT NULL,
  densidInicial SMALLINT NOT NULL,
  densidFinal SMALLINT NOT NULL,
  IBUS DECIMAL (4 , 2),
  alcohol DECIMAL (4, 2),
  aguaMacerado DECIMAL (5, 2),
  aguaMaceradoTemp SMALLINT,
  aguaLavado DECIMAL (5, 2),
  aguaLavadoTemp SMALLINT,
  maceracionTiempo TIME,
  maceracionTemp SMALLINT,
  hervido TIME,
  litrosFinalesFermentador DECIMAL (5, 2),
  botellas INT,
  azucarBotellas DECIMAL(4,2),
  notas VARCHAR (255),
  PRIMARY KEY (id),
  FOREIGN KEY (idCerveza) REFERENCES cerveza(id)
);