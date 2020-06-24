# ethical-hacking-practice
Scripts, Code and Tools info.

Is you want to know all working IPs available in a network use bash script
to check code click [here](https://github.com/mohitsingla123/ethical-hacking-practice/blob/master/Bash%20Scripts/8.1%20ipsweep.sh)

to execute
`./ipsweep.sh <starting ip address> >> ip.txt`

Now we can use this ip.txt file to check if any perticular port is open or not
for checking port 80 is open in any of the ip. execute this is command line.
`for ip in (cat ip.txt); do nmap -sS -p 80 -T4 $ip & done`
-T4 is for fast nmap result
