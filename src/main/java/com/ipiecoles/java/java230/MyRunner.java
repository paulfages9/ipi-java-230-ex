package com.ipiecoles.java.java230;

import com.ipiecoles.java.java230.model.Manager;
import com.ipiecoles.java.java230.model.Technicien;
import com.ipiecoles.java.java230.repository.ManagerRepository;
import com.ipiecoles.java.java230.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.Statement;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private EmployeService employeService;

    @Override
    public void run(String... strings) throws Exception {
            //System.out.println("Nombre d'employés : " + employeService.countAllEmploye());

            //System.out.println(employeService.findById(5L));

            //Manager m = (Manager) ManagerRepository.findByIdFetchEquipe(5L);
            //for (Technicien t : m.getEquipe() ) {
            //    System.out.println(t);
            //}
        }

        /*public void connection () {
            //Initialiser la connexion
            String url = "jdbc:mysql://localhost:3306/entreprise";
            String user = "root";
            String pwd = "2poules1jardin";
            java.sql.Connection connexion = null;
            try {
                connexion = java.sql.DriverManager.getConnection(url, user, pwd);
            } catch ( java.sql.SQLException e ) {
                //Problème de connexion à la base !
            }

            //Requête de SELECT qui récupère toutes les lignes de la table test
            //La variable de type Statement permettra de gérer des requêtes SQL
            Statement statement = connexion.createStatement();

            //La variable de type ResultSet contiendra les résultats de la requêtes
            String query = "SELECT * FROM test";
            ResultSet resultSet = statement.executeQuery(query);

            //Afficher les résultats
            //On parcours un à un les résultats grâche à next() qui renvoie un booléen
            //précisant s'il y a une ligne suivante dans nos résultats et récupère ce
            //résultat le cas échéant (au début, son curseur est situé avant le premier élément).
            while(resultSet.next()){
                System.out.println("Value : " + resultSet.getInt("test"));
        }

        //Requêtes d'INSERT
        query = "INSERT INTO test VALUES (2)";
        int status = statement.executeUpdate(query);

        //Affichage du nombre de lignes insérées
        System.out.println("Statut : "+ status);


        //Lorsqu'on a fini de l'utiliser :
        if(connexion != null) {
            try {
                connexion.close();
            }
            catch ( java.sql.SQLException e ) {
                //Problème de déconnexion, ce n'est pas très grave...
            }
        }




        //Affichage du nombre de lignes insérées


    }

    public static void print(Object t) {
        System.out.println(t);
    }*/
}
