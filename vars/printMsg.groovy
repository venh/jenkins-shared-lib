def printMessage(String jobName) {
  message = "Hi " + jobName + ". This is from Shared Library."
}

def call (String jobName) {
   printMessage(to, from, subject, body)
}
