<?php
require ('Shirt.php');

//Data
$data_input = array(
    new Shirt("001", "T-Shirt", "Adidas", "$25.99", "M", "Cotton", "Male", "Blue", "Short"),
    new Shirt("002", "Blouse", "H&M", "$19.99", "S", "Silk", "Female", "Pink", "Long"),
    new Shirt("003", "Polo Shirt", "Ralph Lauren", "$39.99", "L", "Polyester", "Male", "White", "Short")
);

//Membuat tabel
echo "<table border='1'>";

// Header tabel
echo "<tr>";
echo "<th>No</th>";
echo "<th>Id Product</th>";
echo "<th>Name</th>";
echo "<th>Brand</th>";
echo "<th>Price</th>";
echo "<th>Size</th>";
echo "<th>Material</th>";
echo "<th>Gender</th>";
echo "<th>Color</th>";
echo "<th>Sleeve Type</th>";
echo "</tr>";

// Menampilkan data dalam tabel
foreach ($data_input as $key => $data) 
{
    echo "<tr>";
    echo "<td>" . ($key + 1) . "</td>";
    echo "<td>" . $data->getIdProduct() . "</td>";
    echo "<td>" . $data->getName() . "</td>";
    echo "<td>" . $data->getBrand() . "</td>";
    echo "<td>" . $data->getPrice() . "</td>";
    echo "<td>" . $data->getSize() . "</td>";
    echo "<td>" . $data->getMaterial() . "</td>";
    echo "<td>" . $data->getGender() . "</td>";
    echo "<td>" . $data->getColor() . "</td>";
    echo "<td>" . $data->getSleeve_type() . "</td>";
}

// Menutup tabel
echo "</table>";

?>