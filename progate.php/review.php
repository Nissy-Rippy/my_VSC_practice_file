<?php
class Review {
  private $menuName;
  // $userNameを$userIdに書き換えてください
  private $userId;
  private $body;

  // 引数の$userNameを$userIdに書き換えてください
  public function __construct($menuName, $userId, $body) {
    $this->menuName = $menuName;
    // userNameをuserIdに書き換えてください
    $this->userId = $userId;
    $this->body = $body;
  }

  public function getMenuName() {
    return $this->menuName;
  }

  public function getBody() {
    return $this->body;
  }
  
  public function getUser($users) {
    foreach ($users as $user) {
      // $userのidプロパティと、インスタンス自身のuserIdプロパティを比べるように書き換えてください
      if ($user -> getId() == $this -> userId) {
        return $user;
      }
    }
  }
  
}

?>