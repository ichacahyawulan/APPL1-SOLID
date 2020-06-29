# APPL1 - SOLID

**S.O.L.I.D** merupakan suatu prinsip dalam menulis kode object-oriented agar nantinya didapatkan suatu kode yang baik. Berikut penjelasan singkat terkait prinsip **S.O.L.I.D**

*sumber* : [link](https://medium.com/@riansyahtohamba/prinsip-s-o-l-i-d-d842d21169e8)

**S : Single Responsibility Principle**
---
Setiap kelas hanya punya satu tugas. Sehingga kelas itu cuman punya satu alasan untuk berubah,yakni merubah satu tugas yang diberikan padanya.
**O : Open For extension, Closed For Modification Principle**
---
Kelas yang sudah ditulisi dan disepakati behaviornya harus gampang diwariskan , dan tidak boleh diubah-ubah lagi. Cara mengubahnya dengan mewariskan ke kelas turunan yang punya behavior baru.
**L : Liskov Substitute Principle**
---
Kelas turunan harus bisa menjadi pegganti kelas parrent-nya. Tidak boleh methodnya dioverride lalu dikosongkan/lempar eksepsi (degenerate implementation)
**I : Interface Segregation Principle**
---
satu interface Tidak boleh menyediakan semua service (god class) bagi semua jenis client objek. Satu interface mempunyai tugas spesifik untuk tiap klien nya
**D : Dependency inversion Principle**
---
Modul level-tinggi tidak bergantung pada modul level rendah. Keduanya bergantung pada abstraksi. Sementara abstraksi tidak bergantung kepada detail. Malah detail yang harus bergantung pada abstraksi.

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
Refactor dilakukan agar kode sesuai dengan prinsip **Interface Segregation**

## 5. Security Door
Diberikan kelas sebagai berikut
* SecurityManager
* abstract class SecurityCheck
* interface SecurityUI

SecurityManager dapat berinteraksi dengan userr dengan memvalidasi key card atau dengan pin code. Kedua method tersebut terdapat pada interfaace SeccurityUI. Validasi dilakukan oleh kelas SecurityCheck.
Refactor dilakukan agar kode sesuai dengan prinsip **Interface Segregation**
