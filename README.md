# APPL1 - SOLID

## 1. Stream Progress Info
Pada kode ini dilakukan refactoring agar nantinya Stream Progress Info dapat bekerja dengan berbagai jenis Stream. Sehingga ketika ditambahkan Stream baru maka hanya butuh menambahkan satu kelas saja.

## 2. Graphic Editor
Pada kode ini dilakukan refactoring agar Graphic Editor dapat menggambar semua jenis shape tanpa perlu memeriksa seperti apa bentuknya terlebih dahulu. Sehingga ketika akan ditambahkan shape baru, maka hanya butuh untuk mmenambahkan kelas baru saja.

## 3. Detail Printer
Pada kode ini dilakukan refactoring agar Detail Printer tidak perlu menanyakan employee apa yang diberikan. Detail Printer hanya perlu menampilkan detail dari setiap jenis employee. Sehinggga ketiika jenis employee baru ditambahkan, hanya butuh menambahkan kelas baru.

## 4. Recharge
Diberikan suatu library dengan kelas berikut
* Worker yang mengimplementasi ISleeper
* Employee yang inherit terhadap Worker
* Robot yang inherit terhadap Worker
* RechargeStation

Pada kode ini terdapat beberapa kelas yang mempunyai method yang tidak dapat digunakan (throw UnsupportedOpperationException), sehingga harus di refactor.

## 5. Security Door
Diberikan kelas sebagai berikut
* SecurityManager
* abstract class SecurityCheck
* interface SecurityUI

SecurityManager dapat berinteraksi dengan userr dengan memvalidasi key card atau dengan pin code. Kedua method tersebut terdapat pada interfaace SeccurityUI. Validasi dilakukan oleh kelas SecurityCheck.
Refactor dilakukan agar kode sesuai dengan prinsip **Interface Segregation**
