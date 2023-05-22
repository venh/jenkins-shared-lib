def printMessage(String jobName) {
  message = "Hi '" + jobName + "'. This is from Shared Library."
  print message
}

def call (String jobName) {
   printMessage(jobName)
}
