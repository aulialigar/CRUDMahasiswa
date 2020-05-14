package com.example.modul6;

public class konfigurasi {
    public static final String URL_ADD = "http://192.b168.56.1/modul5/insert.php";
    public static final String URL_GET_ALL = "http://192.168.56.1/modul5/read.php";
    public static final String URL_GET_MHS = "http://192.168.56.1/modul5/select.php?id=";
    public static final String URL_UPDATE_MHS = "http://192.168.56.1/modul5/update.php";
    public static final String URL_DELETE_MHS = "http://192.168.56.1/modul5/delete.php?id=";
    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Script PHP
    public static final String KEY_MHS_ID = "id";
    public static final String KEY_MHS_NAMA = "nama";
    public static final String KEY_MHS_JURUSAN = "jurusan";
    public static final String KEY_MHS_EMAIL = "email";
    //JSON Tags
    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_JURUSAN = "jurusan";
    public static final String TAG_EMAIL = "email";
    //ID Mahasiswa
    //mhs itu singkatan dari Mahasiswa
    public static final String MHS_ID = "mhs_id";

}
