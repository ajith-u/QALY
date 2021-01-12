n=int(input())
if(1<=n<=100):
  sum=0.0
  ch=True
  for i in range(0,n):
    l=input().split()
    q=float(l[0])
    y=float(l[1])
    if(0<q<=1 and 0<y<=100):
      sum+=q*y
    else:
      ch=False
      break
  if(ch): print('{0:.3f}'.format(sum))