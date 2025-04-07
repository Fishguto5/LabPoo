package abstract_class.proj_hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instructions instructions = new Instructions();
        H Hospital = new H("São Luiz dos Cocais", "Rua Morumbi, 123");
        System.out.println("Boas vindas ao sistema do Hosipital!\n");
        instructions.showdetails();
        while (sc.hasNext()){
            int command = sc.nextInt();
            switch (command){
                case 1:
                    System.out.println("A lista de especialidades do hospital é: " + Hospital.getspecialist());
                    instructions.showdetails();
                    break;

                case 2:
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println(name + " tem especialidade em: " + Hospital.returnSpecialist(name) + "\n");
                    instructions.showdetails();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Digite o nome do(a) médico(a)\n");
                    String newDoctor = sc.nextLine();
                    System.out.println("Digite a especialidade do(a) médico(a)\n");
                    String newDoctorSpecialist = sc.nextLine();
                    Hospital.addEmploy(newDoctor,newDoctorSpecialist);
                    System.out.println("Especilista: " + newDoctor + "Especialidade: " + newDoctorSpecialist + "foi adicionado\n");
                    instructions.showdetails();
                    break;
                case 4:
                    sc.nextLine();
                    String speciality = sc.nextLine();
                    Hospital.addSpecialty(speciality);
                    instructions.showdetails();
                    break;

                case 5:
                    sc.close();
                    return;
            }


        }


    }
}
