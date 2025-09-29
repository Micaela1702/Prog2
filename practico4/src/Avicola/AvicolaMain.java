package Empresa;

public class RegistroEmpresaMain {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Creamos un empleado
        Empleado emp1 = new Empleado("Juan", "Pérez", "Secretario", 33, 50000, 400.000);

        // Creamos un usuario final
        UsuarioFinal user1 = new UsuarioFinal("Ana", "Gómez", "Secretaria", 25, "1234", "123444224");

        // Creamos un jerárquico con empleados a cargo
        Jerarquico jefe = new Jerarquico("Carlos", "López", "Repositor", 200, 100000, 10.000);
        jefe.agregarEmpleado(emp1);

        // Los agregamos a la empresa
        empresa.agregarPersona(emp1);
        empresa.agregarPersona(user1);
        empresa.agregarPersona(jefe);

        // Exportamos el registro
        System.out.println(empresa.exportarRegistro());
    }
}


