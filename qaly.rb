n=gets.to_i;
if(n.between?(1,100))
  sum=0.0
  ch=true
  n.times do
    q,y=gets.chomp.split.map(&:to_f)
    if(0<q and q<=1 and 0<y and y<=100)
      sum+=q*y  
    else 
      ch=false 
      break
    end
  end
  puts '%.3f' % sum if(ch)
end
