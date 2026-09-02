# TP Grupal OO2 Hito 1

## Número de Grupo: 04

---

## Integrantes del Grupo

| Nombre |  
|--------|
| Angel Valentín Altieri |
| Iara Aznar |
| Emanuel Humberto D'Onofrio | 
| Agustín | 

---
### Casos de Uso Realizados
Angel Altieri:
```java
//Trae un festival con sus unidades de venta
public Festival traerFestival(long idFestival)

//Trae de un festival, las UV que tengan  una superficie mayor a un valor
public Set<UnidadVenta> traerUnidadesDeVentaPorSuperficieMayorA(long idFestival, float superficieMinima)

//Agrega un festival
public int agregarFestival(...)

//Sirve para actualizar la BD, por ej: añado a la lista que tiene festival una unidad de venta en memoria y actualizo para que se impacte en la bd
public void modificar(Festival festival)
```
Emanuel Humberto D'Onofrio:
```java
//Trae un empleado por su ID
public Empleado traer(long idEmpleado)

//Trae empleado por su DNI
public Empleado traerEmpleadoDni(long dni)

//Trae  lista  de empleados
public List<Empleado> traer()

//Agregar Cajero
public int agregarCajero(int dni, String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, float sueldoBase, Turno turno)

//Agregar Cocinero
public int agregarCocinero(int dni, String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, float sueldoBase,  Categoria categoria, float plusCategoria)

//Traer Lista de cocinero por categoría que sean mayor o igual a sueldo minimo
public List<Cocinero> traerCocineroPorCategoriaYSueldo(Categoria categoria, float sueldoMinimo)

//Traer una lista de cajeros por turno
public List<Cajero> traerCajerosPorTurno(Turno turno)

// traer empleados con fecha de ingreso entre fechas pasadas por parametro
public List<Empleado> traerEmpleadosPorFechaIngreso(LocalDate desde, LocalDate hasta)

```
Iara Aznar:
```java
// Agregar FoodTruck
public int agregarFoodTruck(String nombre, long idResponsable, float superficie, String patente, boolean usaElectricidad) throws Exception
// Agregar Puesto Desarmable
public int agregarPuestoDesarmable(String nombre, long idResponsable, float superficie, int cantidadCarpas, int minsMontaje) throws Exception
// Generar Codigo
public String generarCodigo(String tipo)
// Traer Unidad de venta por ID
public UnidadVenta traer(long idUnidadVenta)
// Traer Unidades de venta por Festival
public List<UnidadVenta> traerUnidadesDeVentaPorFestival(long idFestival)
```
