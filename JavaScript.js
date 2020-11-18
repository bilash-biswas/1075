var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines=input.split(' ');
var N = parseInt(lines.shift());
var i;
if(N<10000)
{
 for(i=2;i<=9999;i=i+N)
{

    console.log(i);
}
}
