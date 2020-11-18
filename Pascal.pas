var
N:int64;
i:integer;
begin
   read(N);
   
   if(N<10000)then
      writeln(2);
      for i:=2 to 9999 do
         if((i mod N)=0)then
            writeln(i+2);
end.
