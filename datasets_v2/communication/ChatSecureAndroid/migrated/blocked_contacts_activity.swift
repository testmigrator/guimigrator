
import SwiftUI
struct blocked_contacts_activity: View {
var body: some View {
VStack
{
Text("No blocked contacts.")
.bold()
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.listStyle(PlainListStyle())
}}}

struct blocked_contacts_activity_Previews: PreviewProvider {
    static var previews: some View {
        blocked_contacts_activity()
    }
}
