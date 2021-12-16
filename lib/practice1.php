<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Progate</title>
  <link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>

  <?php

    $x = 5;
    $y = 2;
    $a = 8;
    $b = 4;
  ?>
  <?php
    $x += 10;
    echo $x;
    $y *= 5;
    echo $y;
  ?>

  <br>
  <?php
    $y *= 5;
    echo $y;
  ?>

  <br>

  <?php
    $a += 1;
    echo $a;
  ?>

  <br>

  <?php
  $b -= 1;
 echo $b;

  ?>

<body>

  <?php
    $name = 'にんじゃわんこ';
    echo "こんにちは！{$name}"
    
  ?>

<?php 

  $age = 28;
    if($age >= 30){
      echo "あなたは30歳以上です。";
    }else{
      echo "あなたは30歳未満です。";
    }

    
      <?php
  
    $x = 1071;
    
  if($x % 3 == 0 && $x % 7 == 0){
    echo "xは3の倍数かつ7の倍数です。";
  }elseif($X % 3 == 0){
    echo "xは3の倍数ですが7の倍数ではありません。";
  }elseif($x % 7 == 0){
    echo "xは7の倍数ですが3の倍数ではありません。";
  }else{
    echo "xは7の倍数でも3の倍数でもありません。";
  }
    
  ?>
   <?php

    $num = 3;
  
    $remainder = $num % 3;

    switch($remainder){
      case 0:
        echo "大吉です。";
        break;
      case 1:
        echo "中吉です。";
        break;
      case 2:
        echo "小吉です。";
        break;
      default:
        echo "凶です。";
        break;
    }
  
  ?>
  <?php
  $colors = array("赤","青","黄");
  echo $colors[0];
  $colors[] = "白";
  echo $colors[3];
    
  ?>

</body>
</body>
</html>