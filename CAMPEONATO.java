package PARCIAL2;

import javax.swing.*;
import java.util.Random;
public class CAMPEONATO {
    public static void main(String[] args) {
        Bienvenida();
        Capitanes();
        Partidos();
        Gacias();
    }
    public static void Equipos(){
        String Brazil, Argentina, Colombia, Chile, Peru, Uruguay;
        JOptionPane.showMessageDialog(null,"Los equipos que se presentarán en el campeonato son: ");
        Brazil="BR\nD: Neymar(10), Vinícius(20), Richarlison(11), Raphinha(7), Gabriel Jesus(9) \nCC: Fabinho(15), Fred(5), Bruno(6), Paquetá(8) \nDF: Thiago Silva(3), Militao(4), Dani Alves(2), Danilo(21), Bremer(13) \nPT: Alisson(1), Éderson(23) ";
        JOptionPane.showMessageDialog(null,Brazil);
        Argentina="ARG\nD: Messsi(10), Di María(11), Dybala(21), Papu Gómez(20), Lautaro(22) \nCC: De Paul(7), Palacios(14), Paredes(5), Rodriguez(18)\nDF: Otamendi(19), Tagliafico(3), Acuña(8), Pezzella(6)\nPT: Marttínez(23), Armani(1)";
        JOptionPane.showMessageDialog(null,Argentina);
        Colombia="COL\nD: Falcao(9), Díaz(7), Borré(19), Sinisterra(14), Estupiñan(24)\nCC: Barrios(5), James(10), Cuadrado(11), Uribe(15)\nDF: Mina(3), Lucumi(4), Mojica(17), Fabra(18)\nPT: Ospina(1), Vargas(12) ";
        JOptionPane.showMessageDialog(null,Colombia);
        Chile="CHI\nD: Alexis(7), Valencia(21), Delgado(25), Osorio(11), Rubio(9)\nCC: Medel(17), Vidal(8), Aranguis(20), Alarcón(18)\nDF: Díaz(5), Sierralta(15), Ibacache(30), Mena(2)\nPT: Bravo(1), Cortés(23)";
        JOptionPane.showMessageDialog(null,Chile);
        Peru="PER\nD: Valera(24), Reyna(19), Liza(9), Succar(7)\nCC: Aquino(23), Cartagena(14), Peña(8), Arias(10)\nDF: Abram(2), Callens(22), Araujo(15), López(5)\nPT: Duarte(12), Gallese(1)";
        JOptionPane.showMessageDialog(null,Peru);
        Uruguay="URU\nD: Nuñes(11), Pellistri(8), Gómez(18), Cavani(21), Suarez(9)\nCC: Valverde(15), Vecino(5), Arrascaeta(10), Bentancur(6)\nDF: Araujo(4), Godín(3), Oliveira(16), Viña(17)\nPT: Muslera(1), Sosa(12)";
        JOptionPane.showMessageDialog(null,Uruguay);
    }
    public static void Bienvenida(){
        JOptionPane.showMessageDialog(null,"Bienvenido al campeonato de futbol");
    }
    public static void Gacias(){
        JOptionPane.showMessageDialog(null,"Gracias a los equipos por participar");
    }
    public static void Partidos(){
        int resultado_equipo1, resultado_equipo2;
        int GolesBR, GolesARG, GolesCOL, GolesCHI, GolesPER, GOlesURU, GolesTotal;
        int BRVCOL, BRVARG, BRVCHI, BRVPER,BRVURU,COLVARG,COLVCHI,COLVPER,COLVURU,ARGVCHI,ARGVPER,ARGVURU, CHIVPER,CHIVURU,PERVURU;
        int PuntosBR, PJBR, PGBR,PEBR,PPBR,PuntosCOL,PJCOL,PGCOL,PECOL,PPCOL, PuntosArg,  PJARG, PGARG, PEARG,PPARG, PuntosCHI, PJCHI,PGCHI,PECHI, PPCHI, PuntosPER,PJPER,PGPER,PEPER,PPPER,PuntosURU, PJURU,PGURU,PEURU,PPURU;
        GolesTotal=0;
        GolesBR=0;
        GolesARG=0;
        GolesCOL=0;
        GolesCHI=0;
        GolesPER=0;
        GOlesURU=0;
        PuntosBR=0;
        PJBR=0;
        PGBR=0;
        PEBR=0;
        PPBR=0;
        PuntosCOL=0;
        PJCOL=0;
        PGCOL=0;
        PECOL=0;
        PPCOL=0;
        PuntosArg=0;
        PJARG=0;
        PGARG=0;
        PEARG=0;PPARG=0;
        PuntosCHI=0;
        PJCHI=0;
        PGCHI=0;
        PECHI=0;
        PPCHI=0;
        PuntosPER=0;
        PJPER=0;
        PGPER=0;
        PEPER=0;
        PPPER=0;
        PuntosURU=0;
        PJURU=0;
        PGURU=0;
        PEURU=0;
        PPURU=0;
        BRVCOL=0;
        BRVARG=0;
        BRVPER=0;
        BRVCHI=0;
        COLVPER=0;
        ARGVURU=0;
        COLVARG=0;
        BRVURU=0;
        COLVCHI=0;
        ARGVPER=0;
        COLVURU=0;
        ARGVCHI=0;
        CHIVPER=0;
        CHIVURU=0;
        PERVURU=0;
        Random rnd1= new Random();
        Random rnd2= new Random();
        JOptionPane.showMessageDialog(null,"Primera jornada\nBR vs COL\nARG vs CHI\nPER vs URU");
        if (BRVCOL==0){
            JOptionPane.showMessageDialog(null,"BRAZIL VS COLOMBIA");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJCOL=PJCOL+1;
            PJBR=PJBR+1;
            GolesBR=GolesBR+resultado_equipo1;
            GolesCOL=GolesCOL+resultado_equipo2;//aaa
            if (resultado_equipo1>resultado_equipo2){
                PuntosBR=PuntosBR+3;
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nColombia:"+resultado_equipo2 );
                PPCOL=PPCOL+1;
                PGBR=PGBR+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nColombia:"+resultado_equipo2 );
                PuntosCOL=PuntosCOL+3;
                PPBR=PPBR+1;
                PGCOL=PGCOL+1;
            }
            else {
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nColombia:"+resultado_equipo2 );
                PuntosBR=PuntosBR+1;
                PuntosCOL=PuntosCOL+1;
                PEBR=PEBR+1;
                PECOL=PECOL+1;
            }
        }
        if (ARGVCHI==0) {
            JOptionPane.showMessageDialog(null,"ARGENTINA VS CHILE");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJARG=PJARG+1;
            PJCHI=PJCHI+1;
            GolesARG=GolesBR+resultado_equipo1;
            GolesCHI=GolesCOL+resultado_equipo2;
            if (resultado_equipo1>resultado_equipo2){
                PuntosArg=PuntosArg+3;
                JOptionPane.showMessageDialog(null,"Argentina:"+resultado_equipo1+"\nChile:"+resultado_equipo2 );
                PPCHI=PPCHI+1;
                PGARG=PGARG+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Argentina:"+resultado_equipo1+"\nChile:"+resultado_equipo2 );
                PuntosCHI=PuntosCHI+3;
                PPARG=PPARG+1;
                PGCHI=PGCHI+1;
            }
            else {
                JOptionPane.showMessageDialog(null,"Argenitna:"+resultado_equipo1+"\nChile:"+resultado_equipo2 );
                PuntosArg=PuntosArg+1;
                PuntosCHI=PuntosCHI+1;
                PECHI=PECHI+1;
                PEARG=PEARG+1;
            }
        }
        if (PERVURU==0) {
            JOptionPane.showMessageDialog(null,"PERU VS URUGUAY");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJPER=PJPER+1;
            PJURU=PJURU+1;
            GolesPER=GolesPER+resultado_equipo1;
            GOlesURU=GOlesURU+resultado_equipo2;
            if (resultado_equipo1>resultado_equipo2){
                PuntosPER=PuntosPER+3;
                JOptionPane.showMessageDialog(null,"Peru:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2);
                PPURU=PPURU+1;
                PGPER=PGPER+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Peru:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2);
                PuntosURU=PuntosURU+3;
                PPARG=PPPER+1;
                PGURU=PGURU+1;
            }
            else {
                JOptionPane.showMessageDialog(null,"Peru:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2);
                PuntosPER=PuntosPER+1;
                PuntosURU=PuntosURU+1;
                PEURU=PEURU+1;
                PEPER=PEPER+1;
            }
        }
        JOptionPane.showMessageDialog(null,"Puntajes del campeonato\nBR: PJ="+PJBR+" PG="+PGBR+" PE="+PEBR+"PP="+PPBR+"\nCOL: PJ="+PJCOL+" PG="+PGCOL+" PE="+PECOL+"PP="+PPCOL+"\nARG: PJ="+PJARG+" PG="+PGARG+" PE="+PEARG+"PP="+PPARG+"\nCHI: PJ="+PJCHI+" PG="+PGCHI+" PE="+PECHI+"PP="+PPCHI+"\nPER: PJ="+PJPER+" PG="+PGPER+" PE="+PEPER+"PP="+PPPER+"\nURU: PJ="+PJURU+" PG="+PGURU+" PE="+PEURU+"PP="+PPURU);
        JOptionPane.showMessageDialog(null,"Segunda Jornada\nCOL vs ARG\nBR vs PER\nCHI vs URU");
        if (COLVARG==0) {
            JOptionPane.showMessageDialog(null,"COLOMBIA VS ARGENTINA");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJARG=PJARG+1;
            PJCOL=PJCOL+1;
            GolesCOL=GolesCOL+resultado_equipo1;
            GolesARG=GolesARG+resultado_equipo2;
            if (resultado_equipo1>resultado_equipo2){
                PuntosCOL=PuntosCOL+3;
                JOptionPane.showMessageDialog(null,"Colombia:"+resultado_equipo1+"\nArgentina:"+resultado_equipo2);
                PPARG=PPARG+1;
                PGCOL=PGCOL+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Colombia:"+resultado_equipo1+"\nArgentina:"+resultado_equipo2);
                PuntosArg=PuntosArg+3;
                PPCOL=PPCOL+1;
                PGARG=PGARG+1;
            }
            else {
                JOptionPane.showMessageDialog(null,"Colombia:"+resultado_equipo1+"\nArgentina:"+resultado_equipo2);
                PuntosArg=PuntosArg+1;
                PuntosCOL=PuntosCOL+1;
                PECOL=PECOL+1;
                PEARG=PEARG+1;
            }
        }
        if (BRVPER==0){
            JOptionPane.showMessageDialog(null,"BRAZIL VS PERU");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJBR=PJBR+1;
            PJPER=PJPER+1;
            GolesBR=GolesBR+resultado_equipo1;
            GolesPER=GolesPER+resultado_equipo2;
            if (resultado_equipo1>resultado_equipo2){
                PuntosBR=PuntosBR+3;
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nPeru:"+resultado_equipo2);
                PPPER=PPPER+1;
                PGBR=PGBR+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nPeru:"+resultado_equipo2);
                PuntosPER=PuntosPER+3;
                PPBR=PPBR+1;
                PGPER=PGPER+1;
            }
            else {
                JOptionPane.showMessageDialog(null, "Brazil:"+resultado_equipo1+"\nPeru:"+resultado_equipo2);
                PuntosPER = PuntosPER + 1;
                PuntosBR = PuntosBR + 1;
                PEBR = PEBR + 1;
                PEPER = PEPER + 1;
            }
        }
        if (CHIVURU==0){
            JOptionPane.showMessageDialog(null,"CHILE VS URUGUAY");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJCHI=PJCHI+1;
            PJURU=PJURU+1;
            GolesCHI=GolesCHI+resultado_equipo1;
            GOlesURU=GOlesURU+resultado_equipo2;
            if (resultado_equipo1>resultado_equipo2){
                PuntosCHI=PuntosCHI+3;
                JOptionPane.showMessageDialog(null,"Chile:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2);
                PPURU=PPURU+1;
                PGCHI=PGCHI+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Chile:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2);
                PuntosURU=PuntosURU+3;
                PPCHI=PPCHI+1;
                PGURU=PGURU+1;
            }
            else {
                JOptionPane.showMessageDialog(null, "Chile:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2);
                PuntosURU = PuntosURU + 1;
                PuntosCHI = PuntosCHI
                        + 1;
                PEURU = PEURU + 1;
                PECHI = PECHI + 1;
            }
        }
        JOptionPane.showMessageDialog(null,"Puntajes del campeonato\nBR: PJ="+PJBR+" PG="+PGBR+" PE="+PEBR+"PP="+PPBR+"\nCOL: PJ="+PJCOL+" PG="+PGCOL+" PE="+PECOL+"PP="+PPCOL+"\nARG: PJ="+PJARG+" PG="+PGARG+" PE="+PEARG+"PP="+PPARG+"\nCHI: PJ="+PJCHI+" PG="+PGCHI+" PE="+PECHI+"PP="+PPCHI+"\nPER: PJ="+PJPER+" PG="+PGPER+" PE="+PEPER+"PP="+PPPER+"\nURU: PJ="+PJURU+" PG="+PGURU+" PE="+PEURU+"PP="+PPURU);
        JOptionPane.showMessageDialog(null,"Tercera Jornada\nCOL vs URU\nBR vs ARG\nCHI vs PER");
        if (COLVURU==0){
            JOptionPane.showMessageDialog(null,"COLOMBIA VS URUGUAY");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJCOL=PJCOL+1;
            PJURU=PJURU+1;
            GolesCOL=GolesCOL+resultado_equipo1;
            GOlesURU=GOlesURU+resultado_equipo2;
            if (resultado_equipo1>resultado_equipo2){
                PuntosCOL=PuntosCOL+3;
                JOptionPane.showMessageDialog(null,"Colombia:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2);
                PPURU=PPURU+1;
                PGCOL=PGCOL+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Colombia:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2);
                PuntosURU=PuntosURU+3;
                PPCOL=PPCOL+1;
                PGURU=PGURU+1;
            }
            else {
                JOptionPane.showMessageDialog(null, "Colombia:" + resultado_equipo1 + "\nUruguay:" + resultado_equipo2);
                PuntosURU = PuntosURU + 1;
                PuntosCOL = PuntosCOL+ 1;
                PEURU = PEURU + 1;
                PECOL = PECOL + 1;
            }
        }
        if (BRVARG==0){
            JOptionPane.showMessageDialog(null,"BRAZIL va ARGENTINA");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJBR=PJBR+1;
            PJARG=PJARG+1;
            GolesBR=GolesBR+resultado_equipo1;
            GolesARG=GolesARG+resultado_equipo2;
            if (resultado_equipo1>resultado_equipo2){
                PuntosBR=PuntosBR+3;
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nArgentina:"+resultado_equipo2);
                PPARG=PPARG+1;
                PGBR=PGBR+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nArgentina:"+resultado_equipo2);
                PuntosArg=PuntosArg+3;
                PPBR=PPBR+1;
                PGARG=PGARG+1;
            }
            else {
                JOptionPane.showMessageDialog(null, "Brazil:" + resultado_equipo1 + "\nArgentina:" + resultado_equipo2);
                PuntosArg = PuntosArg + 1;
                PuntosBR = PuntosBR + 1;
                PEBR = PEBR + 1;
                PEARG = PEARG + 1;
            }
        }
        if (CHIVPER==0) {
            JOptionPane.showMessageDialog(null, "CHILE va PERU");
            resultado_equipo1 = rnd1.nextInt(0, 4);
            resultado_equipo2 = rnd2.nextInt(0, 4);
            PJCHI = PJCHI + 1;
            PJPER = PJPER + 1;
            GolesCHI=GolesCHI+resultado_equipo1;
            GolesPER=GolesPER+resultado_equipo2;
            if (resultado_equipo1 > resultado_equipo2) {
                PuntosCHI = PuntosCHI + 3;
                JOptionPane.showMessageDialog(null, "Chile:" + resultado_equipo1 + "\nPeru:" + resultado_equipo2);
                PPPER = PPPER + 1;
                PGCHI = PGCHI + 1;
            } else if (resultado_equipo1 < resultado_equipo2) {
                JOptionPane.showMessageDialog(null, "Chile:" + resultado_equipo1 + "\nPeru:" + resultado_equipo2);
                PuntosPER = PuntosPER + 3;
                PPCHI = PPCHI + 1;
                PGPER = PGPER + 1;
            } else {
                JOptionPane.showMessageDialog(null, "Chile:" + resultado_equipo1 + "\nPeru:" + resultado_equipo2);
                PuntosPER = PuntosPER + 1;
                PuntosCHI = PuntosCHI + 1;
                PEPER = PEPER + 1;
                PECHI = PECHI + 1;
            }
        }
        JOptionPane.showMessageDialog(null,"Puntajes de la Jornada\nBR: PJ="+PJBR+" PG="+PGBR+" PE="+PEBR+"PP="+PPBR+"\nCOL: PJ="+PJCOL+" PG="+PGCOL+" PE="+PECOL+"PP="+PPCOL+"\nARG: PJ="+PJARG+" PG="+PGARG+" PE="+PEARG+"PP="+PPARG+"\nCHI: PJ="+PJCHI+" PG="+PGCHI+" PE="+PECHI+"PP="+PPCHI+"\nPER: PJ="+PJPER+" PG="+PGPER+" PE="+PEPER+"PP="+PPPER+"\nURU: PJ="+PJURU+" PG="+PGURU+" PE="+PEURU+"PP="+PPURU);
        JOptionPane.showMessageDialog(null,"Segunda Jornada\nBR vs CHI\nCOL vs PER\nARG vs URU");
        if (BRVCHI==0){
            JOptionPane.showMessageDialog(null,"BRAZIL VS CHILE");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJCHI=PJCHI+1;
            PJBR=PJBR+1;
            GolesBR=GolesBR+resultado_equipo1;
            GolesCHI=GolesCHI+resultado_equipo2;
            if (resultado_equipo1>resultado_equipo2){
                PuntosBR=PuntosBR+3;
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nChile:"+resultado_equipo2 );
                PPCHI=PPCHI+1;
                PGBR=PGBR+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nChile:"+resultado_equipo2 );
                PuntosCHI=PuntosCHI+3;
                PPBR=PPBR+1;
                PGCHI=PGCHI+1;
            }
            else {
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nChile:"+resultado_equipo2 );
                PuntosBR=PuntosBR+1;
                PuntosCHI=PuntosCHI+1;
                PEBR=PEBR+1;
                PECHI=PECHI+1;
            }
        }
        if (COLVPER==0) {
            JOptionPane.showMessageDialog(null,"COLOMBIA VS PERU");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJPER=PJPER+1;
            PJCOL=PJCOL+1;
            GolesCOL=GolesCOL+resultado_equipo1;
            GolesPER=GolesPER+resultado_equipo2;
            if (resultado_equipo1>resultado_equipo2){
                PuntosCOL=PuntosCOL+3;
                JOptionPane.showMessageDialog(null,"Colombia:"+resultado_equipo1+"\nPeru:"+resultado_equipo2);
                PPPER=PPPER+1;
                PGCOL=PGCOL+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Colombia:"+resultado_equipo1+"\nPeru:"+resultado_equipo2);
                PuntosArg=PuntosArg+3;
                PPCOL=PPCOL+1;
                PGPER=PGPER+1;
            }
            else {
                JOptionPane.showMessageDialog(null,"Colombia:"+resultado_equipo1+"\nPeru:"+resultado_equipo2);
                PuntosPER=PuntosPER+1;
                PuntosCOL=PuntosCOL+1;
                PECOL=PECOL+1;
                PEPER=PEPER+1;
            }
        }
        if (ARGVURU==0) {
            JOptionPane.showMessageDialog(null,"ARGENTINA VS URUGUAY");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJARG=PJARG+1;
            PJURU=PJURU+1;
            GOlesURU=GOlesURU+resultado_equipo2;
            GolesARG=GolesARG+resultado_equipo1;
            if (resultado_equipo1>resultado_equipo2){
                PuntosArg=PuntosArg+3;
                JOptionPane.showMessageDialog(null,"Argentina:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2 );
                PPURU=PPURU+1;
                PGARG=PGARG+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Argentina:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2 );
                PuntosURU=PuntosURU+3;
                PPARG=PPARG+1;
                PGURU=PGURU+1;
            }
            else {
                JOptionPane.showMessageDialog(null,"Argenitna:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2 );
                PuntosArg=PuntosArg+1;
                PuntosURU=PuntosURU+1;
                PEURU=PEURU+1;
                PEARG=PEARG+1;
            }
        }
        JOptionPane.showMessageDialog(null,"Puntajes del campeonato\nBR: PJ="+PJBR+" PG="+PGBR+" PE="+PEBR+"PP="+PPBR+"\nCOL: PJ="+PJCOL+" PG="+PGCOL+" PE="+PECOL+"PP="+PPCOL+"\nARG: PJ="+PJARG+" PG="+PGARG+" PE="+PEARG+"PP="+PPARG+"\nCHI: PJ="+PJCHI+" PG="+PGCHI+" PE="+PECHI+"PP="+PPCHI+"\nPER: PJ="+PJPER+" PG="+PGPER+" PE="+PEPER+"PP="+PPPER+"\nURU: PJ="+PJURU+" PG="+PGURU+" PE="+PEURU+"PP="+PPURU);
        JOptionPane.showMessageDialog(null,"Quinta Jornada\nBR vs URU\nCOL vs CHI\nARG vs PER");
        if (BRVURU==0){
            JOptionPane.showMessageDialog(null,"BRAZIL VS URUGUAY");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJURU=PJURU+1;
            PJBR=PJBR+1;
            GolesBR=GolesBR+resultado_equipo1;
            GOlesURU=GOlesURU+resultado_equipo2;
            if (resultado_equipo1>resultado_equipo2){
                PuntosBR=PuntosBR+3;
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2 );
                PPURU=PPURU+1;
                PGBR=PGBR+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2 );
                PuntosURU=PuntosURU+3;
                PPBR=PPBR+1;
                PGURU=PGURU+1;
            }
            else {
                JOptionPane.showMessageDialog(null,"Brazil:"+resultado_equipo1+"\nUruguay:"+resultado_equipo2 );
                PuntosBR=PuntosBR+1;
                PuntosURU=PuntosURU+1;
                PEBR=PEBR+1;
                PEURU=PEURU+1;
            }
        }
        if (COLVCHI==0) {
            JOptionPane.showMessageDialog(null,"COLOMBIA VS CHILE");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJCHI=PJCHI+1;
            PJCOL=PJCOL+1;
            GolesCOL=GolesCOL+resultado_equipo1;
            GolesCHI=GolesCHI+resultado_equipo2;
            if (resultado_equipo1>resultado_equipo2){
                PuntosCOL=PuntosCOL+3;
                JOptionPane.showMessageDialog(null,"Colombia:"+resultado_equipo1+"\nChile:"+resultado_equipo2);
                PPCHI=PPCHI+1;
                PGCOL=PGCOL+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Colombia:"+resultado_equipo1+"\nChile:"+resultado_equipo2);
                PuntosCHI=PuntosCHI+3;
                PPCOL=PPCOL+1;
                PGCHI=PGCHI+1;
            }
            else {
                JOptionPane.showMessageDialog(null,"Colombia:"+resultado_equipo1+"\nChile:"+resultado_equipo2);
                PuntosCHI=PuntosCHI+1;
                PuntosCOL=PuntosCOL+1;
                PECOL=PECOL+1;
                PECHI=PECHI+1;
            }
        }
        if (ARGVPER==0) {
            JOptionPane.showMessageDialog(null,"ARGENTINA VS PERU");
            resultado_equipo1=rnd1.nextInt(0,4);
            resultado_equipo2=rnd2.nextInt(0,4);
            PJARG=PJARG+1;
            PJPER=PJPER+1;
            GolesARG=GolesARG+resultado_equipo1;
            GolesPER=GolesARG+resultado_equipo2;
            if (resultado_equipo1>resultado_equipo2){
                PuntosArg=PuntosArg+3;
                JOptionPane.showMessageDialog(null,"Argentina:"+resultado_equipo1+"\nPeru:"+resultado_equipo2 );
                PPPER=PPPER+1;
                PGARG=PGARG+1;
            } else if (resultado_equipo1<resultado_equipo2) {
                JOptionPane.showMessageDialog(null,"Argentina:"+resultado_equipo1+"\nPeru:"+resultado_equipo2 );
                PuntosPER=PuntosPER+3;
                PPARG=PPARG+1;
                PGPER=PGPER+1;
            }
            else {
                JOptionPane.showMessageDialog(null,"Argenitna:"+resultado_equipo1+"\nPeru:"+resultado_equipo2 );
                PuntosArg=PuntosArg+1;
                PuntosPER=PuntosPER+1;
                PEPER=PEPER+1;
                PEARG=PEARG+1;
            }
        }
        GolesTotal=GolesTotal+GolesARG+GolesCHI+GolesCOL+GolesBR+GolesPER+GOlesURU;
        JOptionPane.showMessageDialog(null,"Fin Del Campeonato");
        JOptionPane.showMessageDialog(null,"Resultados del Campeonato\nBR: PJ="+PJBR+" PG="+PGBR+" PE="+PEBR+"PP="+PPBR+"\nCOL: PJ="+PJCOL+" PG="+PGCOL+" PER="+PECOL+"PP="+PPCOL+"\nARG: PJ="+PJARG+" PG="+PGARG+" PE="+PEARG+"PP="+PPARG+"\nCHI: PJ="+PJCHI+" PG="+PGCHI+" PE="+PECHI+"PP="+PPCHI+"\nPER: PJ="+PJPER+" PG="+PGPER+" PE="+PEPER+"PP="+PPPER+"\nURU: PJ="+PJURU+" PG="+PGURU+" PE="+PEURU+"PP="+PPURU);
        JOptionPane.showMessageDialog(null,"Los Puntajes Fueron los siguientes\nBR="+PuntosBR+"\nCOL="+PuntosCOL+"\nARG="+PuntosArg+"\nCHI="+PuntosCHI+"\nPER="+PuntosPER+"\nURU="+PuntosURU);
        JOptionPane.showMessageDialog(null,"Goles en total="+GolesTotal+"\nGoles Brazil="+GolesBR+"\nGoles Argentina="+GolesARG+"\nGoles Colombia="+GolesCOL+"\nGoles Chile="+GolesCHI+"\nGoles Peru="+GolesPER+"\nGoles Uruguay="+GOlesURU);
    }
    public static void Capitanes(){
        int CapBR, CapCOL, CapARG, CapCHI, CapPER,CapURU;
        Equipos();
        CapBR=Integer.parseInt(JOptionPane.showInputDialog(null,"Diga quien quiere que sea el capitan de Brazil (DORSAL)"));
        while (CapBR!=10 & CapBR!=20 & CapBR!=11 & CapBR!=7 & CapBR!=9 & CapBR!=15 & CapBR!=5 & CapBR!=6 & CapBR!=8 & CapBR!=3 & CapBR!=4 & CapBR!=2 & CapBR!=21 & CapBR!=13 & CapBR!=1 & CapBR!=23){
            CapBR=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija un numero de dorsal valido"));
        }
        if (CapBR==10){
            JOptionPane.showMessageDialog(null,"El Capitán es Neymar");
        }
        else {
            if (CapBR==20){
                JOptionPane.showMessageDialog(null,"El Capitán es Vinicius");
            }
            else {
                if (CapBR==11){
                    JOptionPane.showMessageDialog(null,"El Capitán es Richarlison");
                }
                else {
                    if (CapBR==7){
                        JOptionPane.showMessageDialog(null,"El Capitán es Raphinha");
                    }
                    else {
                        if (CapBR==9){
                            JOptionPane.showMessageDialog(null,"El Capitán es Gabriel Jesus");
                        }
                        else {
                            if (CapBR==15){
                                JOptionPane.showMessageDialog(null,"El Capitán es Fabinho");
                            }
                            else {
                                if (CapBR==5){
                                    JOptionPane.showMessageDialog(null,"El Capitán es Fred");
                                }
                                else {
                                    if (CapBR==6){
                                        JOptionPane.showMessageDialog(null,"El Capitán es Bruno");
                                    }
                                    else {
                                        if (CapBR==8){
                                            JOptionPane.showMessageDialog(null,"El Capitán es Paqueta");
                                        }
                                        else {
                                            if (CapBR==3){
                                                JOptionPane.showMessageDialog(null,"El Capitán es Thiago Silva");
                                            }
                                            else {
                                                if (CapBR==4){
                                                    JOptionPane.showMessageDialog(null,"El Capitán es Militao");
                                                }
                                                else {
                                                    if (CapBR==2){
                                                        JOptionPane.showMessageDialog(null,"El Capitán es Dani Alves");
                                                    }
                                                    else {
                                                        if (CapBR==21){
                                                            JOptionPane.showMessageDialog(null,"El Capitán es Danilo");
                                                        }
                                                        else {
                                                            if (CapBR==13){
                                                                JOptionPane.showMessageDialog(null,"El Capitán es Bremer");
                                                            }
                                                            else {
                                                                if (CapBR==1){
                                                                    JOptionPane.showMessageDialog(null,"El Capitán es Alisson");
                                                                }
                                                                else {
                                                                    if (CapBR==23){
                                                                        JOptionPane.showMessageDialog(null,"El Capitán es Ederson");
                                                                    }
                                                                }
                                                                  }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            
       
       CapCOL=Integer.parseInt(JOptionPane.showInputDialog(null,"Diga quien quiere que sea el capitan de Colombia (DORSAL)"));
       while (CapCOL!=9 & CapCOL!=7 & CapCOL!=19 & CapCOL!=14 & CapCOL!=24 & CapCOL!=5 & CapCOL!=10 & CapCOL!=11 & CapCOL!=15 & CapCOL!=3 & CapCOL!=4 & CapCOL!=17 & CapCOL!=18 & CapCOL!=1 & CapCOL!=12){
       	CapCOL=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija un numero de dorsal valido"));
       }
       if (CapCOL==9){
           JOptionPane.showMessageDialog(null,"El Capitán es Falcao");
       }
       else {
           if (CapCOL==7){
               JOptionPane.showMessageDialog(null,"El Capitán es Diaz");
           }
           else {
               if (CapCOL==19){
                   JOptionPane.showMessageDialog(null,"El Capitán es Borré");
               }
               else {
                   if (CapCOL==14){
                       JOptionPane.showMessageDialog(null,"El Capitán es Sinisterra");
                   }
                   else {
                       if (CapCOL==24){
                           JOptionPane.showMessageDialog(null,"El Capitán es Estupiñan");
                       }
                       else {
                           if (CapCOL==5){
                               JOptionPane.showMessageDialog(null,"El Capitán es Barrios");
                           }
                           else {
                               if (CapCOL==10){
                                   JOptionPane.showMessageDialog(null,"El Capitán es James");
                               }
                               else {
                                   if (CapCOL==11){
                                       JOptionPane.showMessageDialog(null,"El Capitán es Cuadrado");
                                   }
                                   else {
                                       if (CapCOL==15){
                                           JOptionPane.showMessageDialog(null,"El Capitán es Uribe");
                                       }
                                       else {
                                           if (CapCOL==3){
                                               JOptionPane.showMessageDialog(null,"El Capitán es Mina");
                                           }
                                           else {
                                               if (CapCOL==4){
                                                   JOptionPane.showMessageDialog(null,"El Capitán es Lucumi");
                                               }
                                               else {
                                                   if (CapCOL==17){
                                                       JOptionPane.showMessageDialog(null,"El Capitán es Mojica");
                                                   }
                                                   else {
                                                       if (CapCOL==18){
                                                           JOptionPane.showMessageDialog(null,"El Capitán es Fabra");
                                                       }
                                                       else {
                                                           if (CapCOL==1){
                                                               JOptionPane.showMessageDialog(null,"El Capitán es Ospina");
                                                           }
                                                           else {
                                                               if (CapCOL==12){
                                                                   JOptionPane.showMessageDialog(null,"El Capitán es Vargas");
                                                               }
                                                                 }
                                                               }
                                                           }
                                                       }
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                       }
                   }
               }
           
        CapARG=Integer.parseInt(JOptionPane.showInputDialog(null,"Diga quien quiere que sea el capitan de Argentina (DORSAL)"));
       while (CapARG!=10 & CapARG!=11 & CapARG!=21 & CapARG!=20 & CapARG!=22 & CapARG!=7 & CapARG!=14 & CapARG!=5 & CapARG!=18 & CapARG!=19 & CapARG!=3 & CapARG!=8 & CapARG!=6 & CapARG!=23 & CapARG!=1){
    	   CapARG=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija un numero de dorsal valido"));
       }
       if (CapARG==10){
           JOptionPane.showMessageDialog(null,"El Capitán es Messi");
       }
       else {
           if (CapARG==11){
               JOptionPane.showMessageDialog(null,"El Capitán es Di Maria");
           }
           else {
               if (CapARG==21){
                   JOptionPane.showMessageDialog(null,"El Capitán es Dybala");
               }
               else {
                   if (CapARG==20){
                       JOptionPane.showMessageDialog(null,"El Capitán es Papu Gomez");
                   }
                   else {
                       if (CapARG==22){
                           JOptionPane.showMessageDialog(null,"El Capitán es Lautaro");
                       }
                       else {
                           if (CapARG==7){
                               JOptionPane.showMessageDialog(null,"El Capitán es De Paul");
                           }
                           else {
                               if (CapARG==14){
                                   JOptionPane.showMessageDialog(null,"El Capitán es Palacios");
                               }
                               else {
                                   if (CapARG==5){
                                       JOptionPane.showMessageDialog(null,"El Capitán es Paredes");
                                   }
                                   else {
                                       if (CapARG==18){
                                           JOptionPane.showMessageDialog(null,"El Capitán es Rodriguez");
                                       }
                                       else {
                                           if (CapARG==19){
                                               JOptionPane.showMessageDialog(null,"El Capitán es Otamendi");
                                           }
                                           else {
                                               if (CapARG==3){
                                                   JOptionPane.showMessageDialog(null,"El Capitán es Tagliafico");
                                               }
                                               else {
                                                   if (CapARG==8){
                                                       JOptionPane.showMessageDialog(null,"El Capitán es Acuña");
                                                   }
                                                   else {
                                                       if (CapARG==6){
                                                           JOptionPane.showMessageDialog(null,"El Capitán es Pezzela");
                                                       }
                                                       else {
                                                           if (CapARG==23){
                                                               JOptionPane.showMessageDialog(null,"El Capitán es Martinez");
                                                           }
                                                           else {
                                                               if (CapARG==1){
                                                                   JOptionPane.showMessageDialog(null,"El Capitán es Armani");
                                                               }
                                                                 }
                                                               }
                                                           }
                                                       }
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                       }
                   }
               }
    
       CapCHI=Integer.parseInt(JOptionPane.showInputDialog(null,"Diga quien quiere que sea el capitan de Chile (Dorsal)"));
       while (CapCHI!=7 & CapCHI!=21 & CapCHI!=25 & CapCHI!=11 & CapCHI!=9 & CapCHI!=17 & CapCHI!=8 & CapCHI!=20 & CapCHI!=17 & CapCHI!=5 & CapCHI!=15 & CapCHI!=30 & CapCHI!=2 & CapCHI!=1 & CapCHI!=23){
    	   CapCHI=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija un numero de dorsal valido"));
       }
       if (CapCHI==7){
           JOptionPane.showMessageDialog(null,"El Capitán es Alexis");
       }
       else {
           if (CapCHI==21){
               JOptionPane.showMessageDialog(null,"El Capitán es Valencia");
           }
           else {
               if (CapCHI==25){
                   JOptionPane.showMessageDialog(null,"El Capitán es Delgado");
               }
               else {
                   if (CapCHI==11){
                       JOptionPane.showMessageDialog(null,"El Capitán es Osorio");
                   }
                   else {
                       if (CapCHI==9){
                           JOptionPane.showMessageDialog(null,"El Capitán es Rubio");
                       }
                       else {
                           if (CapCHI==17){
                               JOptionPane.showMessageDialog(null,"El Capitán es Medel");
                           }
                           else {
                               if (CapCHI==8){
                                   JOptionPane.showMessageDialog(null,"El Capitán es Vidal");
                               }
                               else {
                                   if (CapCHI==20){
                                       JOptionPane.showMessageDialog(null,"El Capitán es Aranguis");
                                   }
                                   else {
                                       if (CapCHI==18){
                                           JOptionPane.showMessageDialog(null,"El Capitán es Alarcon");
                                       }
                                       else {
                                           if (CapCHI==5){
                                               JOptionPane.showMessageDialog(null,"El Capitán es Diaz");
                                           }
                                           else {
                                               if (CapCHI==15){
                                                   JOptionPane.showMessageDialog(null,"El Capitán es Sierralta");
                                               }
                                               else {
                                                   if (CapCHI==30){
                                                       JOptionPane.showMessageDialog(null,"El Capitán es Ibacache");
                                                   }
                                                   else {
                                                       if (CapCHI==2){
                                                           JOptionPane.showMessageDialog(null,"El Capitán es Mena");
                                                       }
                                                       else {
                                                           if (CapCHI==1){
                                                               JOptionPane.showMessageDialog(null,"El Capitán es Bravo");
                                                           }
                                                           else {
                                                               if (CapCHI==23){
                                                                   JOptionPane.showMessageDialog(null,"El Capitán es Cortés");
                                                               }
                                                                 }
                                                               }
                                                           }
                                                       }
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                       }
                   }
               }
           
       CapPER=Integer.parseInt(JOptionPane.showInputDialog(null,"Diga quien quiere que sea el capitan de Perú (DORSAL)"));
       while (CapPER!=24 & CapPER!=19 & CapPER!=9 & CapPER!=7 & CapPER!=23 & CapPER!=14 & CapPER!=8 & CapPER!=10 & CapPER!=2 & CapPER!=22 & CapPER!=15 & CapPER!=5 & CapPER!=12 & CapPER!=1){
    	   CapPER=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija un numero de dorsal valido"));
       }
       if (CapPER==24){
           JOptionPane.showMessageDialog(null,"El Capitán es Valera");
       }
       else {
           if (CapPER==19){
               JOptionPane.showMessageDialog(null,"El Capitán es Reyna");
           }
           else {
               if (CapPER==9){
                   JOptionPane.showMessageDialog(null,"El Capitán es Liza");
               }
               else {
                   if (CapPER==7){
                       JOptionPane.showMessageDialog(null,"El Capitán es Succar");
                   }
                   else {
                       if (CapPER==23){
                           JOptionPane.showMessageDialog(null,"El Capitán es Aquino");
                       }
                       else {
                           if (CapPER==14){
                               JOptionPane.showMessageDialog(null,"El Capitán es Cartagena");
                           }
                           else {
                               if (CapPER==8){
                                   JOptionPane.showMessageDialog(null,"El Capitán es Peña");
                               }
                               else {
                                   if (CapPER==10){
                                       JOptionPane.showMessageDialog(null,"El Capitán es Arias");
                                   }
                                   else {
                                       if (CapPER==2){
                                           JOptionPane.showMessageDialog(null,"El Capitán es Abram");
                                       }
                                       else {
                                           if (CapPER==22){
                                               JOptionPane.showMessageDialog(null,"El Capitán es Callens");
                                           }
                                           else {
                                               if (CapPER==15){
                                                   JOptionPane.showMessageDialog(null,"El Capitán es Araujo");
                                               }
                                               else {
                                                   if (CapPER==5){
                                                       JOptionPane.showMessageDialog(null,"El Capitán es Lopez");
                                                   }
                                                   else {
                                                       if (CapPER==12){
                                                           JOptionPane.showMessageDialog(null,"El Capitán es Duarte");
                                                       }
                                                       else {
                                                           if (CapPER==1){
                                                               JOptionPane.showMessageDialog(null,"El Capitán es Gallese");
                                                           }
                                                                 }
                                                               }
                                                           }
                                                       }
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                       }
                   }
               
       CapURU=Integer.parseInt(JOptionPane.showInputDialog(null,"Diga quien quiere que sea el capitan de Uruguay (DORSAL)"));
    while (CapURU!=11 & CapURU!=8 & CapURU!=18 & CapURU!=21 & CapURU!=9 & CapURU!=15 & CapURU!=5 & CapURU!=10 & CapURU!=6 & CapURU!=4 & CapURU!=3 & CapURU!=16 & CapURU!=17 & CapURU!=1 & CapURU!=12){
    	CapURU=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija un numero de dorsal valido"));
    }
    if (CapURU==11){
        JOptionPane.showMessageDialog(null,"El Capitán es Nuñes");
    }
    else {
        if (CapURU==8){
            JOptionPane.showMessageDialog(null,"El Capitán es Pellistri");
        }
        else {
            if (CapURU==18){
                JOptionPane.showMessageDialog(null,"El Capitán es Gomez");
            }
            else {
                if (CapURU==21){
                    JOptionPane.showMessageDialog(null,"El Capitán es Cavani");
                }
                else {
                    if (CapURU==9){
                        JOptionPane.showMessageDialog(null,"El Capitán es Suarez");
                    }
                    else {
                        if (CapURU==15){
                            JOptionPane.showMessageDialog(null,"El Capitán es Valverde");
                        }
                        else {
                            if (CapURU==5){
                                JOptionPane.showMessageDialog(null,"El Capitán es Vecino");
                            }
                            else {
                                if (CapURU==10){
                                    JOptionPane.showMessageDialog(null,"El Capitán es Arrascaeta");
                                }
                                else {
                                    if (CapURU==6){
                                        JOptionPane.showMessageDialog(null,"El Capitán es Bentancur");
                                    }
                                    else {
                                        if (CapURU==4){
                                            JOptionPane.showMessageDialog(null,"El Capitán es Araujo");
                                        }
                                        else {
                                            if (CapURU==3){
                                                JOptionPane.showMessageDialog(null,"El Capitán es Godin");
                                            }
                                            else {
                                                if (CapURU==16){
                                                    JOptionPane.showMessageDialog(null,"El Capitán es Oliveira");
                                                }
                                                else {
                                                    if (CapURU==17){
                                                        JOptionPane.showMessageDialog(null,"El Capitán es Viña");
                                                    }
                                                    else {
                                                        if (CapURU==1){
                                                            JOptionPane.showMessageDialog(null,"El Capitán es Muslera");
                                                        }
                                                        else {
                                                            if (CapURU==12){
                                                                JOptionPane.showMessageDialog(null,"El Capitán es Sosa");
                                                            }
                                                        }
                                                      }
                                                  }
                                              }
                                          }
                                      }
                                  }
                              }
                          }
                      }
                  }
              }
          }
    }
    }
}