 <?php

    $scores = array(
    '数学' => 70,
    '英語' => 90,
    '国語' => 80
    );
    $scores['国語'] += 5;
    echo $scores['国語'];

    $i = 1;
    while($i <= 100){
      echo $i.'<br>';
      $i += 2;
    }
  for ($i = 1; $i <= 1000; $i++) {
      if($i > 500){
        break;
      }
      echo $i.'<br>';
    }
  $scores = array('数学' => 70, '英語' => 90, '国語' => 80,"物理" => 90);

    foreach ($scores as $key => $value) {
      echo $key.''.'は'.$value.''.'点です。';
    }
        $str = 'progate';

    echo strlen($str);
    
    echo '<br>';
    
    $array = array('HTML', 'CSS', 'PHP');

    
    echo count($array);
    echo '<br>';
    
    echo rand(10,15);
     function getCircleArea($radius) {
      return $radius * $radius * 3;
    }
    $circleArea = getCircleArea(5);
    echo $circleArea;

  ?>