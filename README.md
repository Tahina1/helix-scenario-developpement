# Interface de connexion avec Spring Security - Documentation

Ce projet implémente une configuration de sécurité de base avec Spring Security pour une application web. Il inclut une gestion des utilisateurs, des rôles, des pages de connexion et de déconnexion, ainsi qu'une redirection vers la page de connexion si un utilisateur tente d'accéder à des pages protégées sans être authentifié.

La sécurité des mots de passe sont faites avec BackendBcrypt avec Spring et stocké de maniere que l'on peut voir dans le fichier ./helix-scenario-developpement/src/main/java/group/helix/scenario_dev_app/config/SecurityConfig.java

Cette application n'inclue pas l'inscription (non mentionné dans la description du test scenario), mais il y a déjà des utilisateurs disponibles par defaut (voir en dessous)

## Technogies utilisées

- **Java/Spring boot** : pour la partie Backend
- **Thymeleaf** : pour la partie Frontend (intégré à Spring en MVC ici)
- **MySQL** : pour la partie Base de donnée

  
## Prérequis

- **JDK 17 ou supérieur** : Assurez-vous d'avoir installé Java 17 ou une version ultérieure.
- **Maven** : Utilisé pour gérer les dépendances et exécuter le projet.
- **MySQL 8.0.41** : pour la base de donnée.

## Installation

1. **Cloner le projet** :
   - Clonez ce dépôt sur votre machine locale :

   ```bash
   git clone https://github.com/Tahina1/helix-scenario-developpement

2. **Creer la base de donnee** :
   - executer le code sql dans : ./helix-scenario-developpement/src/main/resources/database-schema.sql

3. **Deplacer dans le répertoire du projet** :
   ```bash
   cd scenario_dev_app (linux)
  
5. **Installer les dépendances** :
    ```bash
    mvn clean install

## Exécution de l'application

1. **Démarrer l'application** :
    ```bash
    mvn spring-boot:run
  
2. **Démarrer l'application** :
   - Ouvrez votre navigateur et accédez à l'adresse http://localhost:8080

   - Il y a un utilisateur de test disponible qui est admin sur le site

   - Nom d'utilisateur:  'admin'
     
   - Mot de passe: 'password' (Bcrypté $2a$10$RCa5SUPmMxleZfQLm8wAF.ZoIa82A16YzE2y0PFYzBAYIrBWsrEaW)

4. **Démarrer les test** :
    ```bash
    mvn test
   

