create table T01_SOLICITUD(
  ID INTEGER PRIMARY KEY,
  ESTADO INTEGER,
  FECHA_INGRESO DATE,
  MONTO DECIMAL,
  ID_CLIENTE VARCHAR(100)
 );
 
 create index IDX_ID_CLIENTE ON T01_SOLICITUD (ID_CLIENTE)