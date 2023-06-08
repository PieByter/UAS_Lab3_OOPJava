// Jawaban :
//  a. Inheritance (Pewarisan):
//  Inheritance adalah konsep dalam pemrograman berorientasi objek di mana sebuah kelas (kelas turunan) dapat mewarisi properti dan metode dari kelas lain (kelas induk).
//  Dalam pewarisan, kelas yang mewarisi dikenal sebagai kelas turunan atau subkelas, sementara kelas yang memberikan warisan dikenal sebagai kelas induk atau superclass.
//  Pewarisan memungkinkan kita untuk memanfaatkan kembali kode yang sudah ada, mengatur hierarki kelas, dan memperluas fungsionalitas melalui tambahan metode dan properti di kelas turunan.
//
//  b. Polymorphism (Polimorfisme):
//  Polymorphism adalah konsep dalam pemrograman berorientasi objek yang mengizinkan suatu objek untuk merujuk pada berbagai jenis objek yang berbeda dan menunjukkan perilaku yang berbeda tergantung pada jenis objek yang sedang direferensikan.
//  Polimorfisme dapat dicapai melalui dua mekanisme: overriding dan overloading.
//  Overriding terjadi ketika metode di kelas turunan memiliki implementasi yang berbeda dari metode di kelas induk.
//  Overloading terjadi ketika ada beberapa metode dengan nama yang sama tetapi dengan parameter yang berbeda di kelas yang sama atau dalam hierarki kelas.
//
//  c. Kelas Interface:
//  Interface adalah kontrak yang digunakan untuk menggambarkan perilaku yang harus dipenuhi oleh kelas yang mengimplementasikannya. Interface mendefinisikan metode tanpa memberikan implementasi detail.
//  Kelas yang mengimplementasikan sebuah interface harus memberikan implementasi untuk semua metode yang didefinisikan dalam interface tersebut.
//  Dalam Java, sebuah kelas dapat mengimplementasikan beberapa interface secara bersamaan. Interface juga dapat menyediakan konstan (variabel final) dan metode default dengan implementasi.
//
//  d. Eksepsi dan Thread:
//  Eksepsi (Exception) adalah kondisi abnormal yang terjadi saat program sedang berjalan.
//  Ketika sebuah eksepsi terjadi, program dapat menghentikan aliran normalnya dan melakukan penanganan eksepsi untuk mengatasi atau memberikan tanggapan terhadap kondisi tersebut.
//  Eksepsi digunakan untuk menangani situasi yang tidak terduga, seperti kesalahan input, kegagalan operasi, atau keadaan yang tidak normal lainnya.
//
//  Thread adalah unit eksekusi independen dalam suatu program yang dapat berjalan secara paralel atau konkuren.
//  Dalam pemrograman multithreading, suatu program dapat memiliki beberapa thread yang berjalan secara bersamaan, memungkinkan tugas-tugas yang berbeda untuk dieksekusi secara paralel.
//  Thread dapat digunakan untuk menjalankan tugas-tugas yang membutuhkan pemrosesan terpisah atau tugas-tugas yang memerlukan responsivitas dan kinerja yang lebih baik.
//  Dalam thread, Anda dapat menjalankan kode secara konkuren, mengelola sinkronisasi antar thread, dan mengkoordinasikan eksekusi dengan cara yang aman.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws PerangkatException {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama televisi :");
        String Tnama = input.nextLine();
        System.out.println("Masukkan merek televisi :");
        String Tmerek = input.nextLine();
        System.out.println("Masukkan ukuran televisi (dalam inch) :");
        Integer Tukuran = input.nextInt();
        input.nextLine();
        System.out.println();
        System.out.println("Masukkan nama smartphone :");
        String SP_nama = input.nextLine();
        System.out.println("Masukkan merek smartphone :");
        String SP_merek = input.nextLine();
        System.out.println("Masukkan OS Smartphone :");
        String SP_OS = input.nextLine();

        Televisi tv = new Televisi(Tnama, Tmerek, Tukuran);
        Smartphone smartphone = new Smartphone(SP_nama, SP_merek, SP_OS);
        Smartphone iPhone = new Smartphone();

        RemoteControl remoteControl1 = new RemoteControl(tv);
        RemoteControl remoteControl2 = new RemoteControl(smartphone);
        RemoteControl remoteControl3 = new RemoteControl(iPhone);

        remoteControl1.nyalakan();
        remoteControl1.matikan();
        System.out.println();
        remoteControl2.nyalakan();
        remoteControl2.matikan();
        System.out.println();
        remoteControl3.nyalakan();
        remoteControl3.matikan();
        System.out.println();

        // Exception and Thread
        var perangkat = new PerangkatElektronik("Radio","Baseus");

        try {
            perangkat.nyalakan();
        } catch (PerangkatException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // Thread untuk melakukan tugas tambahan
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000); // Menghentikan thread selama 5 detik (contoh penggunaan Thread.sleep())
                System.out.println("Tugas tambahan selesai.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        System.out.println("Program selesai.");
    }
}


