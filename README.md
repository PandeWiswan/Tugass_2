# Proyek manajemen villa berbasis Java

Ini adalah sebuah proyek yang dibuat menggunakan bahasa pemrograman Java, yang bertujuan untuk mengelola sistem penyewaan villa. Seluruh kode program disimpan di dalam folder bernama Villa. Proyek ini mencakup fitur-fitur penting seperti pencatatan data villa, pengelolaan reservasi pelanggan, serta fungsionalitas lain yang mendukung operasional penyewaan villa secara digital.

# Tentang Kelompok Kami

I Made Gede Arya Wedha 2405551031

I Dewa Made Andreano Aldri 2405551146

Pande Gde Wiswan Wasudewa 2405551066

Gede ALit Devriyana 2405551133

# Menjalankan Kode Program

# Request Postman
Berikut adalah Tampilan Request dari Postman beserta Penjelasannya
## GET http://localhost:7000/villas
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

    {
        "address": 0.0,
        "name": "Villa Indah",
        "description": "Villa dengan pemandangan pegunungan",
        "id": 1
    }
![WhatsApp Image 2025-07-01 at 23 03 33](https://github.com/user-attachments/assets/2ab49929-ec7d-4141-9c07-562bebba516e)

    {
        "address": 0.0,
        "name": "Villa Tropis",
        "description": "Villa dekat pantai dengan desain tropis",
        "id": 2
    }
![WhatsApp Image 2025-07-01 at 23 03 58](https://github.com/user-attachments/assets/48ef57a0-6a53-4fd4-bcb9-ed447f7bfa64)

    {
        "address": 0.0,
        "name": "Villa Sejuk",
        "description": "Villa asri di tengah hutan pinus",
        "id": 3
    }
![WhatsApp Image 2025-07-01 at 23 04 25](https://github.com/user-attachments/assets/74404ef0-a9b7-41fc-b411-6d778c7ab5f5)

    {
        "address": 0.0,
        "name": "Villa Modern",
        "description": "Villa minimalis dengan teknologi smart home",
        "id": 4
    }
![WhatsApp Image 2025-07-01 at 23 04 51](https://github.com/user-attachments/assets/43ffcaf8-4432-4dba-91a2-c75efdea2b1b)

    {
        "address": 0.0,
        "name": "Villa Kayu",
        "description": "Villa dari material kayu alami",
        "id": 5
    }
![WhatsApp Image 2025-07-01 at 23 05 16](https://github.com/user-attachments/assets/e1166599-0674-4c01-af15-b0a0ef92decc)

## GET http://localhost:7000/bookings
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

    {
        "phone": "08123456789",
        "name": "Budi Santoso",
        "id": 1,
        "email": "budi@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 14 53](https://github.com/user-attachments/assets/c327e0d1-be30-4204-97da-64e2b1790716)

    {
        "phone": "08987654321",
        "name": "Siti Aminah",
        "id": 2,
        "email": "siti@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 15 31](https://github.com/user-attachments/assets/5529111e-b33b-4fc8-98d6-e04565fa807a)

    {
        "phone": "0811223344",
        "name": "John Doe",
        "id": 3,
        "email": "john@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 16 21](https://github.com/user-attachments/assets/2f6f0d06-9a22-4630-9f45-20fbc6a97d05)

    {
        "phone": "08123334455",
        "name": "Rina Kusuma",
        "id": 4,
        "email": "rina@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 17 04](https://github.com/user-attachments/assets/306e6c67-ed01-425d-8685-a4edfe2a6166)

    {
        "phone": "0899112233",
        "name": "Andi Pratama",
        "id": 5,
        "email": "andi@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 17 25](https://github.com/user-attachments/assets/609cccfd-c45d-4203-912d-52896fc19552)

    {
        "phone": "0888123456",
        "name": "Lia Hartono",
        "id": 6,
        "email": "lia@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 17 56](https://github.com/user-attachments/assets/b0982367-ae97-45aa-884d-825de6477a44)

    {
        "phone": "0819988776",
        "name": "Tono Wijaya",
        "id": 7,
        "email": "tono@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 19 06](https://github.com/user-attachments/assets/7e735531-b342-4963-94bd-443a1beb4d36)

    {
        "phone": "0878123011",
        "name": "Grace Salim",
        "id": 8,
        "email": "grace@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 19 31](https://github.com/user-attachments/assets/5447d5c8-fd0f-42a0-8c00-11438db1db76)

    {
        "phone": "0856112377",
        "name": "Felix Nugroho",
        "id": 9,
        "email": "felix@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 19 55](https://github.com/user-attachments/assets/9b4c43cc-0d52-4641-a98e-06dd9c143018)

    {
        "phone": "0899099888",
        "name": "Citra Dewi",
        "id": 10,
        "email": "citra@example.com"
    }
![WhatsApp Image 2025-07-04 at 14 20 27](https://github.com/user-attachments/assets/53e750b8-6238-42f3-bde3-ff92d734bceb)
[
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
]

[
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
]

