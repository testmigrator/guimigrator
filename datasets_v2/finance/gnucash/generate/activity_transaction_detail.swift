import SwiftUI
struct activity_transaction_detail: View {

var body: some View {
HStack
{
VStack
{
Rectangle()
{
VStack
{
Text("Transaction description which can be rather long")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,20)
.lineLimit(3)
Text("Expenses:Computer")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,8)
.padding(.leading,8)
.italic()
.foregroundColor(Color(.gray))
.lineLimit(1)
.alignmentGuide(.bottom) { _ in 0 }
.truncationMode(.middle)
.prefix(5)
}
.frame(minWidth:0,maxWidth:.infinity)
}
.fill(Color.white)
.frame(minWidth:0,maxWidth:.infinity,minHeight:128,idealHeight:128)
ScrollView
{
List
{
HStack
{
Text("Balance")
.frame(minWidth:0,idealWidth:0)
.bold()
.font(.system(size: 16))
.foregroundColor(Color(.gray))
Text("$ 2000")
.frame(minWidth:0,idealWidth:0)
.bold()
.font(.system(size: 16))
.foregroundColor(Color(.gray))
Text("$ 2000")
.frame(minWidth:0,idealWidth:0)
.bold()
.font(.system(size: 16))
.foregroundColor(Color(.gray))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,6)
.padding(.top,5)
.padding(.bottom,5)
HStack
{
Image("ic_action_time")
Text("")
}
.padding(.top,20)
HStack
{
Image("ic_action_sort_by_size")
Text("")
}
HStack
{
Image("ic_action_rotate_right")
Text("")
}
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,20)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
Rectangle()
.frame(minWidth:40,idealWidth:40,minHeight:40,idealHeight:40)
.padding(.leading,6)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_transaction_detail_Previews: PreviewProvider {
    static var previews: some View {
        activity_transaction_detail()
    }
}
