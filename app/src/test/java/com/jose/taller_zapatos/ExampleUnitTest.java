package com.jose.taller_zapatos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void total_hombre_zapatilla_nike(){
        double cantidad =2,precio=120000;
        double  resul=metodo.total_pago(cantidad,precio);
        assertEquals(240000,resul,0  );
    }
    @Test
    public void total_mujer_zapatilla_nike(){
        double cantidad =3,precio=100000;
        double  resul=metodo.total_pago(cantidad,precio);
        assertEquals(300000,resul,0  );
    }
    @Test
    public void total_mujer_clasico_puma(){
        double cantidad =2,precio=120000;
        double  resul=metodo.total_pago(cantidad,precio);
        assertEquals(240000,resul,0  );
    }
    @Test
    public void total_hombre_clasico_puma(){
        double cantidad =10,precio=100000;
        double  resul=metodo.total_pago(cantidad,precio);
        assertEquals(1000000,resul,0  );
    }

}