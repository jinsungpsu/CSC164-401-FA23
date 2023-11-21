        // arithmetic exception - unchecked exception
        //System.out.println(1/0);

        String trainerName;
        try {
            // relative path
            File trainerNameFile = new File("src\\main\\resources\\trainerName.txt");
            // absolute path
            // File trainerNameFile = new File("Z:\\FA23\\CSC164-401-FA23\\week13-listviewAndFileIO\\src\\main\\resources\\trainerName.txt");
            Scanner fileInput = new Scanner(trainerNameFile);

            trainerName = fileInput.nextLine();

            System.out.println(trainerName);
        } catch (FileNotFoundException e) {
//            System.out.println("PROBLEM!!!!");
//            System.out.println("Coudl not open the file!!!");
//            System.exit(401);

            trainerName = "DEFAULT TRAINER NAME";
        }

        // Scanner fileInput = new Scanner(new File("trainerName.txt"));

        String title = trainerName + "'s " + headerText.getText();
        headerText.setText(title);
