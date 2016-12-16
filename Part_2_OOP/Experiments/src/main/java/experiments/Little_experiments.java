package ru.smurtazin.experiments;

class Little_experiments {
	public static void main(String[] args) {
		
		// --- Exp 3 ---
	/*try {
    Driver driver = new FabricMySQLDriver();
    DriverManager.registerDriver(driver);
  } catch (SQLException ex){
    System.out.println("Error registring driver!");
    return;
  }

  try (Connection connection =
       DriverManager.getConnection( URL, USERNAME, PASSWORD);
     Statement statement = connection.createStatement()) {

    statement.execute("insert into my_jdbc.products (product_name, product_price, shop_id) values ('KKulic', 1, 1)");

  } catch (SQLException ex) {
    ex.printStackTrace();
  }*/

  // --- Exp 2 ---
		/*System.out.printf("Two: %1$s; One: %2$s.\n", "two", "one");*/

	// --- Exp 5 ---
	// String task_id, task_name, task_description;
	String task_id = "str1";
	String task_name = "str2";
	String task_description = "Str3";
	String string_to_query_test = String.format("UPDATE tasks (task_id, task_name, task_description) VALUES (%1$s, %2$s, %3$s);", task_id, task_name, task_description);
	System.out.println( string_to_query_test );

		// --- Exp 1 ---
		/*while (true) {

		  String input = System.console().readLine("Print someth (print \"q\" for exit): ");
		  if ("q".equals(input)) {
		    System.out.println("Exit!");
		    System.exit(0);
		  }

		  System.out.printf("You printed: %s\n", input);
		  System.out.println("-----------\n");
		}*/

	}
}