# Proyek manajemen villa berbasis Java

Ini adalah sebuah proyek yang dibuat menggunakan bahasa pemrograman Java, yang bertujuan untuk mengelola sistem penyewaan villa. Seluruh kode program disimpan di dalam folder bernama Villa. Proyek ini mencakup fitur-fitur penting seperti pencatatan data villa, pengelolaan reservasi pelanggan, serta fungsionalitas lain yang mendukung operasional penyewaan villa secara digital.

# Tentang Kelompok Kami

I Made Gede Arya Wedha 2405551031

I Dewa Made Andreano Aldri 2405551146

Pande Gde Wiswan Wasudewa 2405551066

Gede ALit Devriyana 2405551133

# Menjalankan Kode Program

Untuk menjalankan kode program ini, pengguna cukup membuka file Main.java yang berada di dalam package Tugas2. Program ini menggunakan kelas Server untuk memulai server lokal pada port 7000, lalu mengatur routing melalui objek Router. Setelah itu, program akan menjalankan method start() untuk mengaktifkan server. Di IntelliJ IDEA, pengguna dapat menekan ikon segitiga hijau di samping method main, atau klik kanan di dalam editor lalu memilih opsi "Run Main.main()". Jika berhasil dijalankan, terminal akan menampilkan pesan "Server running on port 7000" yang menandakan bahwa server telah aktif dan siap menerima request sesuai dengan routing yang telah didefinisikan di dalam Router.
![WhatsApp Image 2025-07-04 at 17 04 53](https://github.com/user-attachments/assets/ad9dc435-78c8-4207-9de7-7bcf196766ba)

# Request Postman

Postman adalah sebuah aplikasi yang digunakan untuk menguji dan berinteraksi dengan API (Application Programming Interface) secara mudah dan efisien. Aplikasi ini memungkinkan pengguna untuk melakukan berbagai jenis permintaan HTTP seperti GET, POST, PUT, DELETE, dan lainnya, tanpa perlu menulis kode program secara langsung.. Berikut adalah Tampilan Request di Postman yang sudah kami kerjakan.

## GET http://localhost:7000/villas
Fungsi GET villas ini bertujuan untuk menampilkan ada berapa villa yang terdaftar dalam database.

    {
        "address": 0.0,
        "name": "Villa Indah",
        "description": "Villa dengan pemandangan pegunungan",
        "id": 1
    },
    {
        "address": 0.0,
        "name": "Villa Tropis",
        "description": "Villa dekat pantai dengan desain tropis",
        "id": 2
    },
    {
        "address": 0.0,
        "name": "Villa Sejuk",
        "description": "Villa asri di tengah hutan pinus",
        "id": 3
    },
    {
        "address": 0.0,
        "name": "Villa Modern",
        "description": "Villa minimalis dengan teknologi smart home",
        "id": 4
    },
    {
        "address": 0.0,
        "name": "Villa Kayu",
        "description": "Villa dari material kayu alami",
        "id": 5
    }  
![WhatsApp Image 2025-07-01 at 22 57 25](https://github.com/user-attachments/assets/4498cc29-9ea1-4f6a-bfb1-e32b99f7289e)

### GET villas/id
Fungsi GET villas/id ini bertujuan untuk menampilkan villa yang terdaftar dalam database dan ditampilkan satu-persatu.

#### 1. Villa Indah
    {
        "address": 0.0,
        "name": "Villa Indah",
        "description": "Villa dengan pemandangan pegunungan",
        "id": 1
    }
![WhatsApp Image 2025-07-01 at 23 03 33](https://github.com/user-attachments/assets/2ab49929-ec7d-4141-9c07-562bebba516e)

#### 2. Villa Tropis
    {
        "address": 0.0,
        "name": "Villa Tropis",
        "description": "Villa dekat pantai dengan desain tropis",
        "id": 2
    }
![WhatsApp Image 2025-07-01 at 23 03 58](https://github.com/user-attachments/assets/48ef57a0-6a53-4fd4-bcb9-ed447f7bfa64)

#### 3. Villa Sejuk
    {
        "address": 0.0,
        "name": "Villa Sejuk",
        "description": "Villa asri di tengah hutan pinus",
        "id": 3
    }
![WhatsApp Image 2025-07-01 at 23 04 25](https://github.com/user-attachments/assets/74404ef0-a9b7-41fc-b411-6d778c7ab5f5)

#### 4. Villa Modern
    {
        "address": 0.0,
        "name": "Villa Modern",
        "description": "Villa minimalis dengan teknologi smart home",
        "id": 4
    }
![WhatsApp Image 2025-07-01 at 23 04 51](https://github.com/user-attachments/assets/43ffcaf8-4432-4dba-91a2-c75efdea2b1b)

#### 5. Villa Kayu
    {
        "address": 0.0,
        "name": "Villa Kayu",
        "description": "Villa dari material kayu alami",
        "id": 5
    }
![WhatsApp Image 2025-07-01 at 23 05 16](https://github.com/user-attachments/assets/e1166599-0674-4c01-af15-b0a0ef92decc)

## GET http://localhost:7000/bookings
Fungsi GET bookings ini bertujuan untuk menampilkan ada berapa bookingan yang terdaftar dalam database.

    {
        "final_price": 1350000,
        "checkin_date": "2025-06-20 14:00:00",
        "price": 1500000,
        "voucher": 1,
        "has_checkedin": 1,
        "payment_status": "success",
        "id": 1,
        "checkout_date": "2025-06-22 12:00:00",
        "customer": 1,
        "room_type": 1,
        "has_checkedout": 1
    },
    {
        "final_price": 4800000,
        "checkin_date": "2025-07-01 15:00:00",
        "price": 6000000,
        "voucher": 2,
        "has_checkedin": 0,
        "payment_status": "waiting",
        "id": 2,
        "checkout_date": "2025-07-05 12:00:00",
        "customer": 2,
        "room_type": 3,
        "has_checkedout": 0
    },
    {
        "final_price": 500000,
        "checkin_date": "2025-06-25 13:00:00",
        "price": 500000,
        "voucher": 0,
        "has_checkedin": 0,
        "payment_status": "failed",
        "id": 3,
        "checkout_date": "2025-06-26 11:00:00",
        "customer": 3,
        "room_type": 2,
        "has_checkedout": 0
    },
    {
        "final_price": 2340000,
        "checkin_date": "2025-07-10 14:00:00",
        "price": 2600000,
        "voucher": 1,
        "has_checkedin": 1,
        "payment_status": "success",
        "id": 4,
        "checkout_date": "2025-07-12 11:00:00",
        "customer": 4,
        "room_type": 4,
        "has_checkedout": 1
    },
    {
        "final_price": 1400000,
        "checkin_date": "2025-06-28 12:00:00",
        "price": 1400000,
        "voucher": 0,
        "has_checkedin": 0,
        "payment_status": "waiting",
        "id": 5,
        "checkout_date": "2025-06-30 11:00:00",
        "customer": 5,
        "room_type": 5,
        "has_checkedout": 0
    },
    {
        "final_price": 5700000,
        "checkin_date": "2025-06-22 14:00:00",
        "price": 6000000,
        "voucher": 3,
        "has_checkedin": 1,
        "payment_status": "success",
        "id": 6,
        "checkout_date": "2025-06-25 11:00:00",
        "customer": 6,
        "room_type": 6,
        "has_checkedout": 1
    },
    {
        "final_price": 1190000,
        "checkin_date": "2025-07-03 14:00:00",
        "price": 1700000,
        "voucher": 4,
        "has_checkedin": 1,
        "payment_status": "success",
        "id": 7,
        "checkout_date": "2025-07-05 11:00:00",
        "customer": 7,
        "room_type": 7,
        "has_checkedout": 0
    },
    {
        "final_price": 4500000,
        "checkin_date": "2025-07-01 15:00:00",
        "price": 4500000,
        "voucher": 0,
        "has_checkedin": 1,
        "payment_status": "success",
        "id": 8,
        "checkout_date": "2025-07-04 11:00:00",
        "customer": 8,
        "room_type": 3,
        "has_checkedout": 1
    },
    {
        "final_price": 450000,
        "checkin_date": "2025-06-24 13:00:00",
        "price": 500000,
        "voucher": 1,
        "has_checkedin": 1,
        "payment_status": "success",
        "id": 9,
        "checkout_date": "2025-06-25 11:00:00",
        "customer": 9,
        "room_type": 2,
        "has_checkedout": 1
    },
    {
        "final_price": 1500000,
        "checkin_date": "2025-06-21 14:00:00",
        "price": 1500000,
        "voucher": 0,
        "has_checkedin": 0,
        "payment_status": "failed",
        "id": 10,
        "checkout_date": "2025-06-23 12:00:00",
        "customer": 10,
        "room_type": 1,
        "has_checkedout": 0
    }
![WhatsApp Image 2025-07-04 at 13 48 25](https://github.com/user-attachments/assets/cf48e987-6a25-4aff-8bcc-5996c621f497)

## GET bookings/id
Fungsi GET bookings/id ini bertujuan untuk menampilkan bookingan yang terdaftar dalam database dan ditampilkan satu-persatu.

#### 1. Book 1
    {
        "final_price": 1350000,
        "checkin_date": "2025-06-20 14:00:00",
        "price": 1500000,
        "voucher": 1,
        "has_checkedin": 1,
        "payment_status": "success",
        "id": 1,
        "checkout_date": "2025-06-22 12:00:00",
        "customer": 1,
        "room_type": 1,
        "has_checkedout": 1
    }
![WhatsApp Image 2025-07-04 at 14 22 13](https://github.com/user-attachments/assets/44a6af02-d943-43aa-bf50-d8f4ed105f0e)

#### 2. Book 2
    {
        "final_price": 4800000,
        "checkin_date": "2025-07-01 15:00:00",
        "price": 6000000,
        "voucher": 2,
        "has_checkedin": 0,
        "payment_status": "waiting",
        "id": 2,
        "checkout_date": "2025-07-05 12:00:00",
        "customer": 2,
        "room_type": 3,
        "has_checkedout": 0
    }
![WhatsApp Image 2025-07-04 at 14 22 52](https://github.com/user-attachments/assets/c64354e4-bf53-4e90-b04f-9041460c8acf)

#### 3. Book 3
    {
        "final_price": 500000,
        "checkin_date": "2025-06-25 13:00:00",
        "price": 500000,
        "voucher": 0,
        "has_checkedin": 0,
        "payment_status": "failed",
        "id": 3,
        "checkout_date": "2025-06-26 11:00:00",
        "customer": 3,
        "room_type": 2,
        "has_checkedout": 0
    }
![WhatsApp Image 2025-07-04 at 14 44 43](https://github.com/user-attachments/assets/a8394fd8-632a-434a-a9ce-5ac6beee034f)

#### 4. Book 4
    {
        "final_price": 2340000,
        "checkin_date": "2025-07-10 14:00:00",
        "price": 2600000,
        "voucher": 1,
        "has_checkedin": 1,
        "payment_status": "success",
        "id": 4,
        "checkout_date": "2025-07-12 11:00:00",
        "customer": 4,
        "room_type": 4,
        "has_checkedout": 1
    }
![WhatsApp Image 2025-07-04 at 14 45 05](https://github.com/user-attachments/assets/83f90d96-1d59-4905-8373-7b91b46a39c5)

#### 5. Book 5
    {
        "final_price": 1400000,
        "checkin_date": "2025-06-28 12:00:00",
        "price": 1400000,
        "voucher": 0,
        "has_checkedin": 0,
        "payment_status": "waiting",
        "id": 5,
        "checkout_date": "2025-06-30 11:00:00",
        "customer": 5,
        "room_type": 5,
        "has_checkedout": 0
    }
![WhatsApp Image 2025-07-04 at 14 46 29](https://github.com/user-attachments/assets/5be972e8-6d56-4485-8ab4-22d473c270c5)

#### 6. Book 6
    {
        "final_price": 4500000,
        "checkin_date": "2025-07-01 15:00:00",
        "price": 4500000,
        "voucher": 0,
        "has_checkedin": 1,
        "payment_status": "success",
        "id": 8,
        "checkout_date": "2025-07-04 11:00:00",
        "customer": 8,
        "room_type": 3,
        "has_checkedout": 1
    }
![WhatsApp Image 2025-07-04 at 14 47 42](https://github.com/user-attachments/assets/ce6e39e0-a065-4c1c-9f22-a5449e3ffa96)

#### 7. Book 7
    {
        "final_price": 4500000,
        "checkin_date": "2025-07-01 15:00:00",
        "price": 4500000,
        "voucher": 0,
        "has_checkedin": 1,
        "payment_status": "success",
        "id": 8,
        "checkout_date": "2025-07-04 11:00:00",
        "customer": 8,
        "room_type": 3,
        "has_checkedout": 1
    }
![WhatsApp Image 2025-07-04 at 14 48 03](https://github.com/user-attachments/assets/2904c487-67d8-4b0c-9884-b454fa735764)

## GET http://localhost:7000/customers
Fungsi GET customers ini bertujuan untuk menampilkan ada berapa customer yang terdaftar dalam database.

    {
        "phone": "08123456789",
        "name": "Budi Santoso",
        "id": 1,
        "email": "budi@example.com"
    },
    {
        "phone": "08987654321",
        "name": "Siti Aminah",
        "id": 2,
        "email": "siti@example.com"
    },
    {
        "phone": "0811223344",
        "name": "John Doe",
        "id": 3,
        "email": "john@example.com"
    },
    {
        "phone": "08123334455",
        "name": "Rina Kusuma",
        "id": 4,
        "email": "rina@example.com"
    },
    {
        "phone": "0899112233",
        "name": "Andi Pratama",
        "id": 5,
        "email": "andi@example.com"
    },
    {
        "phone": "0888123456",
        "name": "Lia Hartono",
        "id": 6,
        "email": "lia@example.com"
    },
    {
        "phone": "0819988776",
        "name": "Tono Wijaya",
        "id": 7,
        "email": "tono@example.com"
    },
    {
        "phone": "0878123011",
        "name": "Grace Salim",
        "id": 8,
        "email": "grace@example.com"
    },
    {
        "phone": "0856112377",
        "name": "Felix Nugroho",
        "id": 9,
        "email": "felix@example.com"
    },
    {
        "phone": "0899099888",
        "name": "Citra Dewi",
        "id": 10,
        "email": "citra@example.com"
    }
![WhatsApp Image 2025-07-04 at 13 52 31](https://github.com/user-attachments/assets/67c9998d-b66a-4912-a748-9398b1facf10)

### GET customers/id
Fungsi GET customers/id ini bertujuan untuk menampilkan customer yang terdaftar dalam database dan ditampilkan satu-persatu.

#### 1. Budi Santoso
    {
        "phone": "08123456789",
        "name": "Budi Santoso",
        "id": 1,
        "email": "budi@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 14 53](https://github.com/user-attachments/assets/c327e0d1-be30-4204-97da-64e2b1790716)

#### 2. Siti Aminah
    {
        "phone": "08987654321",
        "name": "Siti Aminah",
        "id": 2,
        "email": "siti@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 15 31](https://github.com/user-attachments/assets/5529111e-b33b-4fc8-98d6-e04565fa807a)

#### 3. John Doe
    {
        "phone": "0811223344",
        "name": "John Doe",
        "id": 3,
        "email": "john@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 16 21](https://github.com/user-attachments/assets/2f6f0d06-9a22-4630-9f45-20fbc6a97d05)

#### 4. Rina Kusuma
    {
        "phone": "08123334455",
        "name": "Rina Kusuma",
        "id": 4,
        "email": "rina@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 17 04](https://github.com/user-attachments/assets/306e6c67-ed01-425d-8685-a4edfe2a6166)

#### 5. Andi Pratama
    {
        "phone": "0899112233",
        "name": "Andi Pratama",
        "id": 5,
        "email": "andi@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 17 25](https://github.com/user-attachments/assets/609cccfd-c45d-4203-912d-52896fc19552)

#### 5. Lia Hartono
    {
        "phone": "0888123456",
        "name": "Lia Hartono",
        "id": 6,
        "email": "lia@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 17 56](https://github.com/user-attachments/assets/b0982367-ae97-45aa-884d-825de6477a44)

#### 6. Tono Wijaya
    {
        "phone": "0819988776",
        "name": "Tono Wijaya",
        "id": 7,
        "email": "tono@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 19 06](https://github.com/user-attachments/assets/7e735531-b342-4963-94bd-443a1beb4d36)

#### 7. Grace Salim
    {
        "phone": "0878123011",
        "name": "Grace Salim",
        "id": 8,
        "email": "grace@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 19 31](https://github.com/user-attachments/assets/5447d5c8-fd0f-42a0-8c00-11438db1db76)

#### 8. Felix Nugroho
    {
        "phone": "0856112377",
        "name": "Felix Nugroho",
        "id": 9,
        "email": "felix@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 19 55](https://github.com/user-attachments/assets/9b4c43cc-0d52-4641-a98e-06dd9c143018)

#### 9. Citra Dewi
    {
        "phone": "0899099888",
        "name": "Citra Dewi",
        "id": 10,
        "email": "citra@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 20 27](https://github.com/user-attachments/assets/53e750b8-6238-42f3-bde3-ff92d734bceb)

## GET http://localhost:7000/rooms
Fungsi GET rooms ini bertujuan untuk menampilkan ada berapa ruangan/kamar yang terdaftar dalam database.

    {
        "bed_size": "queen",
        "quantity": 5,
        "has_desk": 1,
        "has_ac": 1,
        "has_tv": 1,
        "has_shower": 1,
        "has_fridge": 1,
        "capacity": 2,
        "price": 750000,
        "name": "Deluxe Room",
        "id": 1,
        "has_wifi": 1,
        "villa": 1,
        "has_hotwater": 1
    },
    {
        "bed_size": "double",
        "quantity": 10,
        "has_desk": 1,
        "has_ac": 1,
        "has_tv": 0,
        "has_shower": 1,
        "has_fridge": 0,
        "capacity": 2,
        "price": 500000,
        "name": "Standard Room",
        "id": 2,
        "has_wifi": 1,
        "villa": 1,
        "has_hotwater": 1
    },
    {
        "bed_size": "king",
        "quantity": 3,
        "has_desk": 1,
        "has_ac": 1,
        "has_tv": 1,
        "has_shower": 1,
        "has_fridge": 1,
        "capacity": 4,
        "price": 1500000,
        "name": "Ocean View Suite",
        "id": 3,
        "has_wifi": 1,
        "villa": 2,
        "has_hotwater": 1
    },
    {
        "bed_size": "king",
        "quantity": 4,
        "has_desk": 1,
        "has_ac": 1,
        "has_tv": 1,
        "has_shower": 1,
        "has_fridge": 1,
        "capacity": 5,
        "price": 1300000,
        "name": "Family Room",
        "id": 4,
        "has_wifi": 1,
        "villa": 2,
        "has_hotwater": 1
    },
    {
        "bed_size": "queen",
        "quantity": 6,
        "has_desk": 1,
        "has_ac": 0,
        "has_tv": 0,
        "has_shower": 1,
        "has_fridge": 0,
        "capacity": 2,
        "price": 700000,
        "name": "Pine Forest View",
        "id": 5,
        "has_wifi": 1,
        "villa": 3,
        "has_hotwater": 0
    },
    {
        "bed_size": "king",
        "quantity": 2,
        "has_desk": 1,
        "has_ac": 1,
        "has_tv": 1,
        "has_shower": 1,
        "has_fridge": 1,
        "capacity": 2,
        "price": 2000000,
        "name": "Smart Room",
        "id": 6,
        "has_wifi": 1,
        "villa": 4,
        "has_hotwater": 1
    },
    {
        "bed_size": "queen",
        "quantity": 8,
        "has_desk": 1,
        "has_ac": 0,
        "has_tv": 0,
        "has_shower": 1,
        "has_fridge": 1,
        "capacity": 3,
        "price": 850000,
        "name": "Nature Cabin",
        "id": 7,
        "has_wifi": 0,
        "villa": 5,
        "has_hotwater": 0
    }
![WhatsApp Image 2025-07-04 at 14 49 27](https://github.com/user-attachments/assets/fd1a605c-1e37-401f-86a1-9755e7a53599)

### GET rooms/id
Fungsi GET rooms/id ini bertujuan untuk menampilkan ruangan/kamar yang terdaftar dalam database dan ditampilkan satu-persatu.

#### 1. Kamar 1
    {
        "bed_size": "queen",
        "quantity": 5,
        "has_desk": 1,
        "has_ac": 1,
        "has_tv": 1,
        "has_shower": 1,
        "has_fridge": 1,
        "capacity": 2,
        "price": 750000,
        "name": "Deluxe Room",
        "id": 1,
        "has_wifi": 1,
        "villa": 1,
        "has_hotwater": 1
    }
![WhatsApp Image 2025-07-04 at 14 50 57](https://github.com/user-attachments/assets/4dd19595-4c7a-45d4-9ade-3a7ce4d7aca9)

#### 2. Kamar 2
    {
        "bed_size": "double",
        "quantity": 10,
        "has_desk": 1,
        "has_ac": 1,
        "has_tv": 0,
        "has_shower": 1,
        "has_fridge": 0,
        "capacity": 2,
        "price": 500000,
        "name": "Standard Room",
        "id": 2,
        "has_wifi": 1,
        "villa": 1,
        "has_hotwater": 1
    }
![WhatsApp Image 2025-07-04 at 14 51 52](https://github.com/user-attachments/assets/91f9ee1b-9090-42ad-bd38-bb9eea145983)

#### 3. Kamar 3
    {
        "bed_size": "king",
        "quantity": 3,
        "has_desk": 1,
        "has_ac": 1,
        "has_tv": 1,
        "has_shower": 1,
        "has_fridge": 1,
        "capacity": 4,
        "price": 1500000,
        "name": "Ocean View Suite",
        "id": 3,
        "has_wifi": 1,
        "villa": 2,
        "has_hotwater": 1
    }
![WhatsApp Image 2025-07-04 at 14 52 13](https://github.com/user-attachments/assets/3a487187-ac54-414a-a3b8-bc356b9cc5f7)

#### 4. Kamar 4
    {
        "bed_size": "king",
        "quantity": 4,
        "has_desk": 1,
        "has_ac": 1,
        "has_tv": 1,
        "has_shower": 1,
        "has_fridge": 1,
        "capacity": 5,
        "price": 1300000,
        "name": "Family Room",
        "id": 4,
        "has_wifi": 1,
        "villa": 2,
        "has_hotwater": 1
    }
![WhatsApp Image 2025-07-04 at 14 52 39](https://github.com/user-attachments/assets/59dbddd8-5722-4175-ae42-345ffc342674)

#### 5. Kamar 5
    {
        "bed_size": "queen",
        "quantity": 6,
        "has_desk": 1,
        "has_ac": 0,
        "has_tv": 0,
        "has_shower": 1,
        "has_fridge": 0,
        "capacity": 2,
        "price": 700000,
        "name": "Pine Forest View",
        "id": 5,
        "has_wifi": 1,
        "villa": 3,
        "has_hotwater": 0
    }
![WhatsApp Image 2025-07-04 at 14 53 05](https://github.com/user-attachments/assets/c75e465a-dd5f-4c01-82dd-a86920dc73dd)

#### 6. Kamar 6
    {
        "bed_size": "king",
        "quantity": 2,
        "has_desk": 1,
        "has_ac": 1,
        "has_tv": 1,
        "has_shower": 1,
        "has_fridge": 1,
        "capacity": 2,
        "price": 2000000,
        "name": "Smart Room",
        "id": 6,
        "has_wifi": 1,
        "villa": 4,
        "has_hotwater": 1
    }
![WhatsApp Image 2025-07-04 at 14 53 44](https://github.com/user-attachments/assets/e03f8126-6181-47bb-b4f6-3a1e93dc40b5)

## GET http://localhost:7000/vouchers
Fungsi GET vouchers ini bertujuan untuk menampilkan ada berapa voucher yang terdaftar dalam database.

    {
        "end_date": "2025-06-30 23:59:59",
        "code": "DISC10",
        "description": "Diskon 10% semua kamar",
        "discount": 0.1,
        "id": 1,
        "start_date": "2025-06-01 00:00:00"
    },
    {
        "end_date": "2025-07-15 23:59:59",
        "code": "SUMMER20",
        "description": "Diskon 20% khusus musim panas",
        "discount": 0.2,
        "id": 2,
        "start_date": "2025-06-15 00:00:00"
    },
    {
        "end_date": "2025-06-25 23:59:59",
        "code": "FLASH5",
        "description": "Diskon flash 5%",
        "discount": 0.05,
        "id": 3,
        "start_date": "2025-06-20 00:00:00"
    },
    {
        "end_date": "2025-07-31 23:59:59",
        "code": "KING30",
        "description": "Diskon 30% untuk kamar king",
        "discount": 0.3,
        "id": 4,
        "start_date": "2025-07-01 00:00:00"
    }
![WhatsApp Image 2025-07-04 at 15 05 47](https://github.com/user-attachments/assets/4fa2c990-a321-4356-89ac-91764bc98c9a)

### GET vouchers/id
Fungsi GET vouchers/id ini bertujuan untuk menampilkan voucher yang terdaftar dalam database dan ditampilkan satu-persatu.

#### 1. Voucher DISC10
    {
        "end_date": "2025-06-30 23:59:59",
        "code": "DISC10",
        "description": "Diskon 10% semua kamar",
        "discount": 0.1,
        "id": 1,
        "start_date": "2025-06-01 00:00:00"
    }
![WhatsApp Image 2025-07-04 at 16 11 48_6d4169fc](https://github.com/user-attachments/assets/4067c742-d6a0-48f0-95b0-daba6f5278d3)

#### 2. Voucher SUMMER20
    {
        "end_date": "2025-07-15 23:59:59",
        "code": "SUMMER20",
        "description": "Diskon 20% khusus musim panas",
        "discount": 0.2,
        "id": 2,
        "start_date": "2025-06-15 00:00:00"
    }
![WhatsApp Image 2025-07-04 at 16 11 48_53c0614e](https://github.com/user-attachments/assets/ec37bd8b-9344-4515-8e12-91755b5beaa0)

#### 3. Voucher FLASH5
    {
        "end_date": "2025-06-25 23:59:59",
        "code": "FLASH5",
        "description": "Diskon flash 5%",
        "discount": 0.05,
        "id": 3,
        "start_date": "2025-06-20 00:00:00"
    }
![WhatsApp Image 2025-07-04 at 16 11 48_6afe222b](https://github.com/user-attachments/assets/de34a478-6456-4e6d-94ae-d2418ec98f06)

#### 4. Voucher KING30
    {
        "end_date": "2025-07-31 23:59:59",
        "code": "KING30",
        "description": "Diskon 30% untuk kamar king",
        "discount": 0.3,
        "id": 4,
        "start_date": "2025-07-01 00:00:00"
    }
![WhatsApp Image 2025-07-04 at 16 11 48_4907930a](https://github.com/user-attachments/assets/9e084bf4-0af8-43f2-a917-20f0964c67d1)

## GET http://localhost:7000/reviews
Fungsi GET reviews ini bertujuan untuk menampilkan ada berapa reviewer yang terdaftar dalam database.

    {
        "booking": 1,
        "star": 5,
        "title": "Luar Biasa!",
        "content": "Pelayanan dan fasilitas sangat memuaskan. Akan kembali lagi!"
    },
    {
        "booking": 2,
        "star": 4,
        "title": "Pemandangan bagus",
        "content": "Kamar oke, cuma AC agak kurang dingin."
    },
    {
        "booking": 4,
        "star": 5,
        "title": "Nyaman dan bersih",
        "content": "Kamar luas dan rapi, cocok untuk keluarga."
    },
    {
        "booking": 6,
        "star": 3,
        "title": "Harga mahal",
        "content": "Fasilitas oke tapi kurang sesuai harga."
    },
    {
        "booking": 8,
        "star": 5,
        "title": "Mantap!",
        "content": "Pemandangan laut sangat indah, recommended!"
    },
    {
        "booking": 9,
        "star": 2,
        "title": "Kurang memuaskan",
        "content": "TV tidak nyala dan resepsionis tidak ramah."
    }
![WhatsApp Image 2025-07-04 at 16 59 42](https://github.com/user-attachments/assets/d5676a2d-f879-45f3-8ef4-7ee2eeba2800)

### GET reviews/id bookings
Fungsi GET reviews/id ini bertujuan untuk menampilkan reviewer yang terdaftar dalam database berdasarkan data bookingnya dan ditampilkan satu-persatu.

#### 1. Review 1
    {
        "booking": 1,
        "star": 5,
        "title": "Luar Biasa!",
        "content": "Pelayanan dan fasilitas sangat memuaskan. Akan kembali lagi!"
    }
![WhatsApp Image 2025-07-04 at 17 00 02](https://github.com/user-attachments/assets/7b07e961-e129-4fb7-a86d-840233ec065c)

#### 2. Review 2
    {
        "booking": 2,
        "star": 4,
        "title": "Pemandangan bagus",
        "content": "Kamar oke, cuma AC agak kurang dingin."
    }
![WhatsApp Image 2025-07-04 at 17 00 23](https://github.com/user-attachments/assets/b44ff47b-e454-4502-b66c-bde1afcc878c)

#### 3. Review 3
    {
        "booking": 4,
        "star": 5,
        "title": "Nyaman dan bersih",
        "content": "Kamar luas dan rapi, cocok untuk keluarga."
    }
![WhatsApp Image 2025-07-04 at 17 01 14](https://github.com/user-attachments/assets/6be3abb5-d347-487c-b079-6c07fc7b13e8)

#### 4. Review 4
    {
        "booking": 6,
        "star": 3,
        "title": "Harga mahal",
        "content": "Fasilitas oke tapi kurang sesuai harga."
    }
![WhatsApp Image 2025-07-04 at 17 01 40](https://github.com/user-attachments/assets/10754753-fc6b-4658-87ce-5ba55280af98)

#### 5. Review 5
    {
        "booking": 8,
        "star": 5,
        "title": "Mantap!",
        "content": "Pemandangan laut sangat indah, recommended!"
    }
![WhatsApp Image 2025-07-04 at 17 02 06](https://github.com/user-attachments/assets/940c08d5-be0a-4a66-96a8-e51c312b7a36)

#### 6. Review 6
    {
        "booking": 9,
        "star": 2,
        "title": "Kurang memuaskan",
        "content": "TV tidak nyala dan resepsionis tidak ramah."
    }
![WhatsApp Image 2025-07-04 at 17 02 25](https://github.com/user-attachments/assets/051b9b77-5288-4832-957d-7d848a181faa)

## GET error response
Ketika saat melakukan GET entitas yang tidak terdapat pada database, maka akan menampilkan pesan error dalam format json seperti gambar dibawah ini

![Screenshot 2025-07-04 202813](https://github.com/user-attachments/assets/78ba178c-0f6c-449d-a37f-a8b4ef536c30)

## POST response dan error response
Ketika melakukan POST untuk membuat data entitas baru terdapat response yang ditampilkan jika berhasil untuk dijalankan seperti gambar dibawah ini
![Screenshot 2025-07-04 203837](https://github.com/user-attachments/assets/a2a2f460-cb69-4e10-bb54-742fa86d03bf)

Jika ketika saat melakukan POST untuk mengubah data entitas bau akan tetapi salah dalam memasukkan atau tidak sesuai dengan entitas maka akan menampilkan response error dalam bentuk json seperti dibawah ini 

![Screenshot 2025-07-04 203926](https://github.com/user-attachments/assets/b558997f-d79f-41c1-9acd-8b26818fbe95)

## PUT response dan error response
Ketika saat melakukan PUT untuk mengubah data dari entitas harus menyertakan detail seperti villas/id untuk dapat mengubah suatu data dari entitas yang ingin di ubah dan jika berhasil dijalankan akan menampilkan response seperti gambar dibawah

![Screenshot 2025-07-04 204154](https://github.com/user-attachments/assets/dc200a76-387b-4b2a-8533-e74dd9ef9529)

Akan tetapi ketika ingin PUT untuk mengubah data dari entitas tetapi data atau entitas yang ingin diubah tidak ada pada database maka akan menampilkan error responnse seperti gambar dibawah ini

![Screenshot 2025-07-04 210104](https://github.com/user-attachments/assets/88e9d837-6d45-4108-8e47-5ad48ed137c3)

## DELETE response
DELETE pada postman bertujuan untuk menghapus data dari entitas, jika dijalankan akan menampilkan response seperti gambar dibawah ini

![Screenshot 2025-07-04 204528](https://github.com/user-attachments/assets/4aa72f14-92b9-4153-94d1-9c2b7c4a9d28)
