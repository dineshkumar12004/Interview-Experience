
import itertools

def largestnum(N,K):
  # container size of N
  container = []
  for i in range(N+1):
    if(i>0):
      container.append(i)
  
  while(K>0):
    new_container = []
    new_container.append(container[0])
    for i in range(len(container)):
      if(container[i] == container[0]):
        continue
      container[i] = container[i]+container[i-1]
      new_container.append(container[i])
    K-=1

  
  #print(new_container)
  T = []
  for i in range(len(new_container)):
    rem = new_container[i]%10
    T.append(rem)

  res = []

  for j in itertools.permutations(str(number) for number in T):
    res.append("".join(j))
  
  maximum_permutation = max(res, key=int)
  print(int(maximum_permutation))

N = int(input("Enter N:")) # size of initial container 
K = int(input("Enter K:")) # number of days
# calling func
largestnum(N,K)




def main():
  import cProfile
  import pstats

  with cProfile.Profile() as pr:
    largestnum(N,K)
  
  stats = pstats.Stats(pr)
  stats.sort_stats(pstats.SortKey.TIME)
  stats.print_stats()


if __name__ == '__main__':
  main()