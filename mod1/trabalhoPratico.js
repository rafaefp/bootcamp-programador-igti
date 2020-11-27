var num = process.argv[2];

function numeroPrimo(num) {
    for(var i = 2; i < num; i++)
      if(num % i === 0) return false;
    return num > 1;
  }
console.log("O número " + num + " é primo? ", numeroPrimo(num) === true ? "Sim" : "Não");

var primos = [];
for (var i = 2; i < 15; i++)
{
    if (numeroPrimo(i) === true)
    {
        primos.push(i);
    }
}
console.log(primos);

var soma = 0;
for (var i = 0; i < primos.length;i++)
{
    soma += primos[i];
}
console.log("Soma: " + soma);