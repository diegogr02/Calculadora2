package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {
    private static EditText texto;
    private static TextView textoV;
    private static double valorGuardado;
    private static double suma;
    private static double resta;
    private static double producto;
    private static double division;
    private static boolean realizarSuma;
    private static boolean realizarResta;
    private static boolean realizarProducto;
    private static boolean realizarDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) { ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto=(EditText) findViewById(R.id.texto);
        textoV=(TextView) findViewById(R.id.texto);
    }
    public static void guardarValor(){
        String valor=texto.getText().toString();
        valorGuardado=Double.parseDouble(valor);
        texto.setText("0");
    }
    public void click1(View view){
        String valor=texto.getText().toString();
        double n=Double.parseDouble(valor);
        double operacion=(n*10)+1;
        texto.setText(String.valueOf(operacion));
    }
    public void click2(View view){
        String valor=texto.getText().toString();
        double n=Double.parseDouble(valor);
        double operacion=(n*10)+2;
        texto.setText(String.valueOf(operacion));
    }
    public void click3(View view){
        String valor=texto.getText().toString();
        double n=Double.parseDouble(valor);
        double operacion=(n*10)+3;
        texto.setText(String.valueOf(operacion));
    }
    public void click4(View view){
        String valor=texto.getText().toString();
        double n=Double.parseDouble(valor);
        double operacion=(n*10)+4;
        texto.setText(String.valueOf(operacion));
    }
    public void click5(View view){
        String valor=texto.getText().toString();
        double n=Double.parseDouble(valor);
        double operacion=(n*10)+5;
        texto.setText(String.valueOf(operacion));
    }
    public void click6(View view){
        String valor=texto.getText().toString();
        double n=Double.parseDouble(valor);
        double operacion=(n*10)+6;
        texto.setText(String.valueOf(operacion));
    }
    public void click7(View view){
        String valor=texto.getText().toString();
        double n=Double.parseDouble(valor);
        double operacion=(n*10)+7;
        texto.setText(String.valueOf(operacion));
    }
    public void click8(View view){
        String valor=texto.getText().toString();
        double n=Double.parseDouble(valor);
        double operacion=(n*10)+8;
        texto.setText(String.valueOf(operacion));
    }
    public void click9(View view){
        String valor=texto.getText().toString();
        double n=Double.parseDouble(valor);
        double operacion=(n*10)+9;
        texto.setText(String.valueOf(operacion));
    }
    public void click0(View view){
        String valor=texto.getText().toString();
        double n=Double.parseDouble(valor);
        double operacion=(n*10);
        texto.setText(String.valueOf(operacion));
    }
    public void borrar(View view){
        texto.setText("0");
        valorGuardado=0;
    }

    public static void preSuma(View view){
        MainActivity.guardarValor();
        realizarSuma=true;
    }
    public static void suma(){
        String v=texto.getText().toString();
        double valor2=Double.parseDouble(v);
        suma=valorGuardado+valor2;
    }
    public static boolean sumaBool(){
        if (realizarSuma) {
            MainActivity.suma();
            return true;
        }
        return false;
    }
    public static void preResta(View view){
        MainActivity.guardarValor();
        realizarResta=true;
    }
    public static void resta(){
        String v=texto.getText().toString();
        double valor2=Double.parseDouble(v);
        resta=valorGuardado-valor2;
    }
    public static boolean restaBool(){
        if (realizarResta) {
            MainActivity.resta();
            return true;
        }
        return false;
    }
    public static void preProducto(View view){
        MainActivity.guardarValor();
        realizarProducto=true;
    }
    public static void producto(){
        String v=texto.getText().toString();
        double valor2=Double.parseDouble(v);
        producto=valorGuardado*valor2;
    }
    public static boolean productoBool(){
        if (realizarProducto) {
            MainActivity.producto();
            return true;
        }
        return false;
    }

    public static void preDivision(View view){
        MainActivity.guardarValor();
        realizarDivision=true;
    }
    public static void division(){
        String v=texto.getText().toString();
        double valor2=Double.parseDouble(v);
        division=valorGuardado/valor2;
    }
    public static boolean divisionBool(){
        if (realizarDivision) {
            MainActivity.division();
            return true;
        }
        return false;
    }


    public void igual(View view){
        if(MainActivity.sumaBool()){
            texto.setText(String.valueOf(suma));
            realizarSuma=false;
        }
        if(MainActivity.restaBool()){
            texto.setText(String.valueOf(resta));
            realizarResta=false;
        }
        if(MainActivity.productoBool()){
            texto.setText(String.valueOf(producto));
            realizarProducto=false;
        }
        if(MainActivity.divisionBool()){
            texto.setText(String.valueOf(division));
            realizarDivision=false;
        }

    }
}