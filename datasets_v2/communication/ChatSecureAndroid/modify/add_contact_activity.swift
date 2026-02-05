import SwiftUI
struct add_contact_activity: View {

var body: some View {
VStack
{
Text("Account to add to:")
.padding(.top,10)
List
{
ForEach(1..<2)
{
index in
Text("Item \(index)")
}
}
.listStyle(PlainListStyle())
.padding(3)
Text("Username or JabberID of person to add:")
.padding(.top,10)
    
Button(action: {})
{
Text("Send Invite")
.foregroundColor(.black)
}

.padding(.top,20)
Button(action: {})
{
Text("Scan QR")
.foregroundColor(.black)
}

.padding(.top,20)
    Spacer()
    Spacer()
}
.padding(6)
.background(Color.white)}}

struct add_contact_activity_Previews: PreviewProvider {
    static var previews: some View {
        add_contact_activity()
    }
}
