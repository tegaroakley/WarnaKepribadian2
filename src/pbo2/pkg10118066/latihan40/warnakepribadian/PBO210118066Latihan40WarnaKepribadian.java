/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan40WarnaKepribadian {
    
    public static final String RESET = "\u001B[0m";
    public static final String WHITE = "\u001B[37m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    // BG
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_MAGENTA = "\u001B[45m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Pilihan pilihan = new Pilihan();
        Warna warna = new Warna();
        System.out.println(RED + "YUK " + GREEN + "CEK"
                + YELLOW + " KEPRIBADIANMU" + CYAN + " DARI"
                + MAGENTA + " WARNA " + BLUE + " FAVORITMU" + RESET);

        System.out.println();
        System.out.println(BG_RED + WHITE + "\tMERAH\t\t");
        System.out.println(BG_GREEN + WHITE + "\tHIJAU\t\t");
        System.out.println(BG_YELLOW + WHITE + "\tKUNING\t\t");
        System.out.println(BG_BLUE + WHITE + "\tBIRU\t\t");
        System.out.println(BG_MAGENTA + WHITE + "\tUNGU\t\t");
        
        System.out.println();
        System.out.print(RESET + "PILIH WARNA FAVORITMU : ");
        pilihan.setWarna(scanner.next());
        System.out.print("NAMA KAMU : ");
        pilihan.setNama(scanner.next());
        
        System.out.println(" ");
        
        System.out.println("====== HASIL TEST KEPRIBADIAN " + pilihan.getNama().toUpperCase() + " ======");
        
        switch(pilihan.getWarna().toLowerCase()) {
            case "merah": Warna.printData(pilihan.getWarna(), Warna.DATA_MERAH); break;
            case "hijau": Warna.printData(pilihan.getWarna(), Warna.DATA_HIJAU); break;
            case "kuning": Warna.printData(pilihan.getWarna(), Warna.DATA_KUNING); break;
            case "biru": Warna.printData(pilihan.getWarna(), Warna.DATA_BIRU); break;
            case "ungu": Warna.printData(pilihan.getWarna(), Warna.DATA_UNGU); break;
            default: System.out.println("Oops.. Belum teridentifikasi");
        }
        
    }
    
}
