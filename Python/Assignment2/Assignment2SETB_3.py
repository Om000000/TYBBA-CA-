""" Write a Python program to count the occurrences of each word in a given sentence. """

str="Write a Python program to count the occurrences of each word in a given sentence"
wordlist=str.split()
for word in wordlist:
    print(f"{word}:{wordlist.count(word)}")
            
