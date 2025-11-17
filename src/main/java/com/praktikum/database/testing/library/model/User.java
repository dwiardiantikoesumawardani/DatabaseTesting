package com.praktikum.database.testing.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

/**
 * Entity class yang merepresentasikan tabel 'users' dalam database
 * Menggunakan Lombok annotations untuk generate getter, setter, constructor otomatis
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    // Primary key dari tabel users
    private Integer userId;

    // Username unik untuk login
    private String username;

    // Email unik untuk komunikasi
    private String email;

    // Nama lengkap user
    private String fullName;

    // Nomor telepon (optional)
    private String phone;

    // Role user: member, librarian, admin
    private String role;

    // Status akun: active, inactive, suspended
    private String status;

    // Tanggal pendaftaran user (auto-generated)
    private Timestamp registrationDate;

    // Tanggal login terakhir (optional)
    private Timestamp lastLogin;

    // Timestamp ketika record dibuat (auto-generated)
    private Timestamp createdAt;

    // Timestamp ketika record terakhir diupdate (auto-generated oleh trigger)
    private Timestamp updatedAt;
}