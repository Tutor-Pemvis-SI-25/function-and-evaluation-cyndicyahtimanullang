//CYNDI MANULLANG - 12S25040

import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] deskripsitugas = new String[10], kodematkul = new String[10], dosen = new String[10], deadline = new String[10], nimnama = new String[10], status = new String[10], matkul = new String[10], teks = new String[10];
        double[] tingkatkesulitan = new double[10], prioritas = new double[10];
        int[] harihinggadeadline = new int[10];
        String task;
        int i, n;

        n = 0;
        inisialisasi(deskripsitugas, kodematkul, matkul, dosen, deadline, nimnama, tingkatkesulitan, harihinggadeadline, status, prioritas, teks);
        for (i = 0; i <= 9; i++) {
            task = input.nextLine();
            if (task.equals("Add task")) {
                n = Addtask(deskripsitugas, kodematkul, matkul, dosen, deadline, nimnama, tingkatkesulitan, harihinggadeadline, status, prioritas, teks, i, n);
            } else {
                if (task.equals("Update task status")) {
                    Updatetaskstatus(kodematkul, status, n);
                    i = i - 1;
                } else {
                    if (task.equals("Show assigment")) {
                        i = i - 1;
                    } else {
                        if (task.equals("---")) {
                            i = 10;
                        }
                    }
                }
            }
        }
    }
}


