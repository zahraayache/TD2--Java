package exercice2;

import java.io.IOException;

class Fille extends Mere{
 void miage() {System.out.println("Miage");}

 public void a() {System.out.println("Fille_a"); }

 protected void b(Fille fille) {System.out.println("Fille_b(Fille)");}

 public void c(Mere mere) {System.out.println("Fille_c(Mere)");}
 void c(Fille b) {System.out.println("Fille_c(Fille)"); }

 static void d() {System.out.println("static Fille_d");}
 static void d(Mere mere) {System.out.println("Fille_d(Mere)");}

 protected void e() {System.out.println("Fille_e");}
 
 protected void f() {System.out.println("Fille_f");}

 String g() {System.out.println("Fille_g"); return "c";}
 int h() {System.out.println("Fille_h"); return 3;}
 void i() {System.out.println("Fille_i"); return; }
 
void j() throws IOException {System.out.println("Fille_j"); }
 void k() throws Exception {System.out.println("Fille_k"); }
  void l() {System.out.println("Fille_l");}
  void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m"); }
 }
