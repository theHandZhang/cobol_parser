 IDENTIFICATION DIVISION.
 PROGRAM-ID. DIVSTMT.
 DATA DIVISION.
 WORKING-STORAGE SECTION.
 77 SOMEID1 PIC 9(10).
 77 SOMEID2 PIC 9(10).
 77 SOMEID3 PIC 9(10).
 77 SOMEID4 PIC 9(10).
 77 SOMEID11 PIC 9(10).
 77 SOMEID12 PIC 9(10).
 77 SOMEID13 PIC 9(10).
 77 SOMEID14 PIC 9(10).
 77 SOMEID21 PIC 9(10).
 77 SOMEID22 PIC 9(10).
 77 SOMEID23 PIC 9(10).
 77 SOMEID24 PIC 9(10).
 PROCEDURE DIVISION.
    DIVIDE SOMEID1 INTO SOMEID2 GIVING SOMEID3 ROUNDED REMAINDER SOMEID4.
    DIVIDE SOMEID11 INTO SOMEID12 ROUNDED SOMEID13 REMAINDER SOMEID14.
    DIVIDE SOMEID21 BY SOMEID22 GIVING SOMEID23 ROUNDED REMAINDER SOMEID24.