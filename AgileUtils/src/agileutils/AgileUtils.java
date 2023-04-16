/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agileutils;

import SCRUM.ScrumProyect;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Eduar
 */
public class AgileUtils {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScrumProyect proyect = new ScrumProyect("Test", "Proyecto de prueba");

        // requerimientos
        proyect.addRequirement("Hola");
        proyect.addRequirement("Hola2");
        
        // Task
        LocalDate startDate = LocalDate.of(2015, 2, 20);
        LocalDate endDate = LocalDate.of(2017, 1, 15);
        proyect.addTask(0, "task 1", "test de task", Period.between(startDate, endDate));

        // historias de usuario
        proyect.addUserHistory("historia 1", "test ", "aaaaa ");

        // equipos 
        proyect.addTeam("equipo dinamita");
        proyect.teams.get(0).members.add(new TeamMember(0,"Hola"));
        
        System.out.println(proyect.teams);
        
        System.out.println(proyect);
        
        System.out.println("----- Test Backlog ------");
        proyect.backlog.addItem("elemento para backlog");
        proyect.backlog.display();
        proyect.backlog.removeItem(0);
        proyect.backlog.display();
    }
    
}
