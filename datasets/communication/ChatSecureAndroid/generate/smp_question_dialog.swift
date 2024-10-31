import SwiftUI
struct smp_question_dialog: View {

var body: some View {
VStack
{
List
{
HStack
{
ScrollView
{
List
{
HStack
{
Text("Enter a question to send to your contact, and the answer you expect them to give, in order to verify they are who they claim to be.")
}
.padding(6)
HStack
{
TextField("the question to ask", text: .constant(""))
}
.padding(6)
HStack
{
TextField("the expected answer", text: .constant(""))
}
.padding(6)
}
}
}
}
}}}

struct smp_question_dialog_Previews: PreviewProvider {
    static var previews: some View {
        smp_question_dialog()
    }
}
