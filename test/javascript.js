if(name === '山田太郎' && !url){
console.log('山田さんのurlはありません')
}

if(name === '山田太郎' || name === '武田涼'){
console.log('山田太郎さんか武田涼さんです');
}
if(y > 100){
console.log('yは100より大きいです');
} else if(y > 50){
console.log('yは50より大きいです');
} else {
console.log('yは50以下です')
}


var color = 'blue';
switch(color){
  case 'blue':
      console.log('青です');
      break;
  case 'red':
      console.log('赤です');
      break;
  case 'green':
      console.log('緑です');
      break;
  default:
      console.log('無色です');
}
var i = 0;
while(i < 10){
console.log(i);
i++
}

for(var i = 0; i < 10; i++){
  console.log(i); 
}


for (var i = 1; i <= 100; i++){
  if (i % 3 == 0){
    console.log('Hey!');
  }else{
    console.log(i); 
  }
}

var fruit = ['みかん', 'りんご', 'ぶどう'];
var value;
 for (var i = 0; i < 3; i++) {
 value = fruit[i];
  console.log(value);
}


function add() {
var a = 10;
var b = 20;
var result = a + b;
console.log(result);
}

var person = {
name: '',
age: 20,
say: function(){
console.log('こんにちは');
 }
};

person.say()

function add(a, b){
var result = a + b;
console.log(result);
}

add(1, 1);
add(10, 20);

function add(a, b){
var result = a + b;
return result;
}

var result1 = add(1, 1); 
console.log(result1);

var result2 = add(10, 20);
console.log(result2);

var result3 = add(result1, result2);
console.log(result3);


  let index = 0;
  $('.main-img').eq(index).addClass('current-img');
  setInterval(function () {
    $('.main-img').eq(index).removeClass('current-img');
    if (index == $('.main-img').length - 1) {
      index = 0;
    } else {
      index++;
    }
    $('.main-img').eq(index).addClass('current-img');
  }, 3000);
});

// ポートフォリオの復習javascript

(document).on('turbolinks:load', function(){
    const inputForm = $('#searching-form');
    const searchResult = $('.result ul');
  function builtHTML(data){
    let html = `
    <li><a href="/videos/${data.id}/edit" data-method="get">${data.title}<a></li>
    `
    searchResult.append(html);
  }

  function NoResult(message){
    let html = `
    <li>${message}</li>
    `
    searchResult.append(html);

  }
  
  inputForm.on('keyup', function(){
    const target = $(this).val();
    search(target);
  });

  function search(target){
    $.ajax({
      type: 'GET',
      url: '/videos/search',
      data: { key_word: target },
      dataType: 'json'
    })
    .done(function(data){
      searchResult.empty();

      if (data.length !== 0){
        data.forEach(function(data){
          builtHTML(data)
        });
      }else{
        NoResult('検索結果がありませんでした')
      }
    })
    .fail(function(data){
      alert("そもそも、非同期通信が行えてないよ！");
    })
  }
});
