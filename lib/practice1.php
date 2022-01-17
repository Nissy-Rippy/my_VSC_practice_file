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
 <?php
  $colors = array("赤","青","黄");
  echo $colors[0];
  $colors[] = "白";
  echo $colors[3];
    
  ?>

      $scores = array(
    '数学' => 70,
    '英語' => 90,
    '国語' => 80
    );
    $scores['国語'] += 5;
    echo $scores['国語'];
  ?>
    for($i = 51; $i <= 100; $i ++){
    echo $i.'<br>';
       }
  ?>

     $i = 2;
    while($i <= 100){
      echo $i.'<br>';
      $i += 2;
    }
    for ($i = 1; $i <= 1000; $i++) {
      if($i > 500){
        break;
      }
      echo $i.'<br>';

      for ($i = 1; $i < 1000; $i++) {
  if($i % 3 == 0) {
    continue;
  }
  echo $i.'<br>';
}
      <?php

    // 関数helloを定義してください
   function hello () {
     echo 'Hello, world!';
   }
    
    // 関数helloを呼び出してください
    
    echo hello();
    echo '<br>';
    // 関数printRectangleAreaを定義してください
    
    function printRectangleArea($height,$width){
      echo $height * $width;
    }
    // 引数を(5, 10)としてprintRectangleAreaを呼び出してください
    echo printRectangleArea(5,10);
    
  ?>


    for($i = 51; $i <= 100; $i ++){
    echo $i.'<br>';
       }
  ?>

     $i = 2;
    while($i <= 100){
      echo $i.'<br>';
      $i += 2;
    }
    for ($i = 1; $i <= 1000; $i++) {
      if($i > 500){
        break;
      }
      echo $i.'<br>';

      for ($i = 1; $i < 1000; $i++) {
  if($i % 3 == 0) {
    continue;
  }
  echo $i.'<br>';
}
      <?php

    // 関数helloを定義してください
   function hello () {
     echo 'Hello, world!';
   }
    
    // 関数helloを呼び出してください
    
    echo hello();
    echo '<br>';
    // 関数printRectangleAreaを定義してください
    
    function printRectangleArea($height,$width){
      echo $height * $width;
    }
    // 引数を(5, 10)としてprintRectangleAreaを呼び出してください
    echo printRectangleArea(5,10);

    <form method="post" action="sent.php">
        <div class="form-item">名前</div>
        <!-- この下にinputタグを書いていきましょう -->
        <input type="text" name="name">
        
        <div class="form-item">内容</div>
        <!-- この下にtextareaタグを書いていきましょう -->
        <textarea name="body"></textarea>
        
      </form>

        <?php 
      echo $_POST["name"];
      ?>
      <div class="form-item">■ 内容</div>
      <!-- bodyを受け取りechoしましょう -->
      <?php
      echo $_POST["body"]
      ?>

       <select name="age">
          <option value="未選択">選択してください</option>
          <!-- for文を用いて6歳から100歳までをoptionで選べるようにしましょう -->
          <?php
          for($i = 6; $i <= 100; $i++) {
           echo "<option value='{$i}>{$i}</option>";
          }
          ?>
        </select>

        <div class="form-item">お問い合わせの種類</div>
        <?php 
          $types = array('Progateに関するお問い合わせ', 'Progateに対する意見', '採用に関するお問い合わせ', '取材・メディア関連のお問い合わせ', '料金に関するお問い合わせ', 'その他');
         ?>
         
        <select name="category">
          <option value="未選択">選択してください</option>
          <?php
           foreach($types as $type){
            echo "<option value='{$type}'>{$type}</option>";
          }
          ?>
        </select>
            $curry = new Menu();
        $pasta = new Menu();
        // $curryのnameプロパティに'CURRY'を代入してください
        $curry -> name = "CURRY";

        // $pastaのnameプロパティに'PASTA'を代入してください
        $pasta -> name = "PASTA";

        // $curryのnameプロパティをechoしてください
        echo $curry -> name;

        echo '<br>';
        // $pastaのnameプロパティをechoしてください
        echo $pasta -> name;

  ?>
</body>
</body>
</html>



<?php
class Menu {
  public $name;
  
  public function hello(){
    echo "私はMenuクラスのインスタンスです";
    echo "私は".$this -> name."です";

  }
  
}

$curry = new Menu();
$pasta = new Menu();
$curry->name = 'CURRY';
$pasta->name = 'PASTA';
echo $curry -> hello();

echo '<br>';
echo $pasta -> hello();

?>

 <div class="menu-wrapper container">
    <h1 class="logo">Café Progate</h1>
    <div class="menu-items">
      <?php foreach ($menus as $menu): ?>
      <h3><?php echo $menu -> name ?>"</h3>
      <?php endforeach ?>
      