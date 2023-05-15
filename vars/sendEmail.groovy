def sendEmail(String emailTo, String emailFrom, String emailSubject, String emailBody) {
   emailext(
                    to: emailTo,
                    subject: emailSubject,
                    body: emailBody,
                    recipientProviders: [culprits(),
                             developers(),
                             requestor(),
                             brokenBuildSuspects(),
                             brokenTestsSuspects(),
                             upstreamDevelopers()
                             ]
                        )
}

def call (String to, String from, String subject, String body) {
   sendEmail(to, from, subject, body)
}
