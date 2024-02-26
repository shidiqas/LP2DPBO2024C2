<?php
require ('Clothing.php');

class Shirt extends Clothing
{   
    //Attributes private
    private $color;
    private $sleeve_type;

    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeve_type)//Constructor with parameter
    {
        parent::__construct($idProduct, $name, $brand, $price, $size, $material, $gender); // Call the constructor of the parent class
        $this->color = $color;
        $this->sleeve_type = $sleeve_type;
    }

    //Getter-Setter
    public function getColor()
    {
        return $this->color;
    }

    public function setColor($color)
    {
        $this->color = $color;
    }

    public function getSleeve_type()
    {
        return $this->sleeve_type;
    }

    public function setSleeve_type($sleeve_type)
    {
        $this->sleeve_type = $sleeve_type;
    }
}

?>
